package com.dannelysbeth.mongorestfullapi.api.handlers;

import com.dannelysbeth.mongorestfullapi.api.handlers.DTO.ErrorResponse;
import com.dannelysbeth.mongorestfullapi.exception.EmailExistsException;
import com.dannelysbeth.mongorestfullapi.exception.IncorrectPasswordException;
import com.dannelysbeth.mongorestfullapi.exception.StudentIdentificationNumberNotFoundException;
import com.dannelysbeth.mongorestfullapi.exception.UsernameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler(EmailExistsException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorResponse emailExistsExceptionHandler(EmailExistsException exception) {
        return new ErrorResponse(exception);
    }
    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorResponse usernameNotFoundExceptionHandler(UsernameNotFoundException exception) {
        return new ErrorResponse(exception);
    }
    @ExceptionHandler(StudentIdentificationNumberNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorResponse studentIdentificationNumberNotFoundExceptionHandler(StudentIdentificationNumberNotFoundException exception) {
        return new ErrorResponse(exception);
    }

    @ExceptionHandler(IncorrectPasswordException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorResponse incorrectPasswordExceptionHandler(IncorrectPasswordException exception) {
        return new ErrorResponse(exception);
    }
}
