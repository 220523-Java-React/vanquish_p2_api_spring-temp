package com.vanquish.health_buddy.exception;

import org.springframework.http.HttpStatus;

import java.util.Locale;

public class ResourceNotFoundException extends ApiException{
    public ResourceNotFoundException(Class<?> clazz, String property, Object value){
        super(
                HttpStatus.NOT_FOUND,
                String.format("Unable to find %s with %s: %s", clazz.getSimpleName().toLowerCase(), property, value.toString())
        );
    }
}
