package com.mb.testservice.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode {
    HttpStatus getHttpStatus();

    String getCode();
}