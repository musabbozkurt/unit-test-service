package com.mb.testservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

public enum TestServiceErrorCode implements Serializable, ErrorCode {

    UNEXPECTED_ERROR(HttpStatus.BAD_REQUEST),
    UNKNOWN_ERROR(HttpStatus.BAD_REQUEST),
    INVALID_VALUE(HttpStatus.BAD_REQUEST),
    NOT_FOUND(HttpStatus.NOT_FOUND);

    @Getter
    private final HttpStatus httpStatus;

    @Getter
    private String message;

    TestServiceErrorCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String getCode() {
        return this.name();
    }

}
