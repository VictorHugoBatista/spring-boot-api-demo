package com.thinkconstructive.rest_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(CloudVendorNotExistsException.class)
    public ResponseEntity<CloudVendorException> handleResourceNotFoundException(CloudVendorNotExistsException ex) {
        CloudVendorException exception = new CloudVendorException(ex.getMessage(), HttpStatus.NOT_FOUND, ex.getCause());
        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CloudVendorException> handleGenericException(Exception ex) {
        CloudVendorException exception = new CloudVendorException(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, ex.getCause());
        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
