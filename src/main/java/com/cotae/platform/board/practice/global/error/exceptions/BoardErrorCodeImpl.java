package com.cotae.platform.board.practice.global.error.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum BoardErrorCodeImpl implements ErrorCode{
    BOARD_WRITE_ROLE_FORBIDDEN(HttpStatus.FORBIDDEN,"User has no role for write Board");

    private final HttpStatus httpStatus;
    private final String message;
}
