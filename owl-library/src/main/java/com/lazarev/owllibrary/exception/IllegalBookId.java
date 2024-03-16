package com.lazarev.owllibrary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class IllegalBookId extends RuntimeException {

    public IllegalBookId(String message) {
        super(message);
    }

}
