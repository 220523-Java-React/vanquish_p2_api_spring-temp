package com.vanquish.health_buddy.exception;

import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends ApiException{
    private static final String INVALID_CREDENTIALS = "Unable to authenticate credentials inserted";
    public InvalidCredentialsException(){
        super(
                HttpStatus.UNAUTHORIZED,
                INVALID_CREDENTIALS);
        }
    }

