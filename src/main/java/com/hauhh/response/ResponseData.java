package com.hauhh.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseData<T> {

    private int statusCode;

    private String message;

    private T result;

    public ResponseData(int statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public ResponseData(int statusCode, String message, T result) {
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }
}
