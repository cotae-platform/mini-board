package com.cotae.platform.board.practice.aggregate.login.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserDto {

    private final String email;
    private final String password;
    private final String userName;
}
