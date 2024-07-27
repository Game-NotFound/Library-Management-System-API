package com.hauhh.controller;
import com.hauhh.response.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController {

    protected <T> ResponseData<T> buildResponseData(int code, String message, T data) {
        return new ResponseData<>(code, message, data);
    }


    protected ResponseData<String> successResponse(String message) {
        return buildResponseData(HttpStatus.OK.value(), message, null);
    }

    protected <T> ResponseData<T> successResponse(String message, T data) {
        return buildResponseData(HttpStatus.OK.value(), message, data);
    }

}
