package com.dannelysbeth.mongorestfullapi.exception;

import org.springframework.http.HttpStatus;

public class StudentIdentificationNumberNotFoundException extends BusinessException{
    public StudentIdentificationNumberNotFoundException() {
        super(HttpStatus.NOT_FOUND.value(), "Student Identification Number does not exist!");
    }
}
