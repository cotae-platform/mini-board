package com.cotae.platform.board.practice.global.error.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum LoginErrorCodeImpl implements ErrorCode{
    USER_EMAIL_IS_NOT_VALID(HttpStatus.BAD_REQUEST,"User Email is not valid."),
    USER_EMAIL_DUPLICATED(HttpStatus.BAD_REQUEST,"This email is already registered."),
    USER_REQUIRED_PARAM_IS_EMPTY(HttpStatus.BAD_REQUEST, "Required parameters are empty."),
    USER_NOT_EXISTS(HttpStatus.INTERNAL_SERVER_ERROR, "User is not exists");

    private final HttpStatus httpStatus;
    private final String message;
}
