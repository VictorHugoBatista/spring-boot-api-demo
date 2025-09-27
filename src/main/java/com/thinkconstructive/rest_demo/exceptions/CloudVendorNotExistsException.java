package com.thinkconstructive.rest_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CloudVendorNotExistsException extends RuntimeException {
    public CloudVendorNotExistsException(String message) {
        super(message);
    }
}
