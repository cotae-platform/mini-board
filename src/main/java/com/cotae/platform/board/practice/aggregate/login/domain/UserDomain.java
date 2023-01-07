package com.cotae.platform.board.practice.aggregate.login.domain;

import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;

public interface UserDomain {

    boolean isDuplicateEmail(String email);
    UserDto registerUser(UserDto user);
}
