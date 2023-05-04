package com.dannelysbeth.mongorestfullapi.exception;

import org.springframework.http.HttpStatus;

public class IncorrectPasswordException extends BusinessException {
    public IncorrectPasswordException() {
        super(HttpStatus.FORBIDDEN.value(), "Given password is incorrect!");
    }
}
