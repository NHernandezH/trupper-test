package com.truper.demo.exception;

import com.truper.demo.dto.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.lang.model.type.ErrorType;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(DomainException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomError DomainExceptionHandler(DomainException exception){
        return CustomError.builder()
                .message(exception.getMessage())
                .code(HttpStatus.BAD_REQUEST.value()).build();
    }
}
