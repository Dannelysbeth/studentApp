package com.dannelysbeth.mongorestfullapi.exception;

import org.springframework.http.HttpStatus;

public class JwtExpireException extends BusinessException{
    public JwtExpireException() {
        super(HttpStatus.CHECKPOINT.value(),  "Jwt expired!");
    }
}
