package com.cotae.platform.board.practice.global.error.exceptions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BoardExceptions extends RuntimeException{
    private final BoardErrorCodeImpl errorCode;
    private final List<ArgumentError> errors;

    public BoardExceptions(BoardErrorCodeImpl errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errors = new ArrayList<>();
    }

    public BoardExceptions(BoardErrorCodeImpl errorCode, List<ArgumentError> errors){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errors = errors;
    }

    public BoardExceptions(String message,BoardErrorCodeImpl errorCode){
        super(message);
        this.errorCode = errorCode;
        this.errors = new ArrayList<>();
    }

    public BoardExceptions(String message,BoardErrorCodeImpl errorCode, List<ArgumentError> errors){
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
    }
}
