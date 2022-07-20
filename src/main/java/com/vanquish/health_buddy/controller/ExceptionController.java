package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.exception.ApiException;
import com.vanquish.health_buddy.exception.ExceptionResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(ApiException.class)
    public ExceptionResponse handleApiException(ApiException exception, HttpServletRequest request){
        return new ExceptionResponse(exception.setPath(request.getServletPath()));
    }
}
