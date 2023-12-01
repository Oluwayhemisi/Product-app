package com.interswitch.shopping_app.exception;

public class CustomerException extends RuntimeException{
    int statusCode;
    String message;
    public CustomerException(String message,int statusCode){
        this.message = message;
        this.statusCode = statusCode;

    }

}
