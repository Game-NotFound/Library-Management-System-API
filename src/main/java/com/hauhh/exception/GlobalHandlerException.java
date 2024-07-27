package com.hauhh.exception;

import com.hauhh.enums.ErrorCode;
import com.hauhh.response.ResponseData;
import com.hauhh.response.ResponseError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandlerException {

    private final static Logger logger = LoggerFactory.getLogger(GlobalHandlerException.class);

    @ExceptionHandler(ApplicationException.class)
    public ResponseData<ResponseError> handleApplicationException(ApplicationException applicationException){
        ErrorCode errorCode = applicationException.getErrorCode();
        logger.error("Application Exception: [ErrorCode: {} Message: {}]", errorCode.getCode(), errorCode.getMessage());
        return new ResponseData<>(HttpStatus.BAD_REQUEST.value(),
                "Error Message: " + errorCode.getMessage(),
                ResponseError.builder()
                .statusCode(errorCode.getCode())
                .message(errorCode.getMessage())
                .build());
    }
}
