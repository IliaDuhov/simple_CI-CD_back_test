package com.example.LabDock.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<ExceptionObject> handleCityNotFoundException(UserNotFoundException ex, WebRequest webRequest){
        ExceptionObject exceptionObject = new ExceptionObject();

//        exceptionObject.setStatusCode(HttpStatus.NOT_FOUND.value());
//        exceptionObject.setMesage(exceptionObject.getMesage());
//        exceptionObject.setTimestamp(new Date());

        return new ResponseEntity<ExceptionObject>(exceptionObject, HttpStatus.NOT_FOUND);
    }
}
