package com.cotae.platform.board.practice.aggregate.login.application;

import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;

public interface LoginService {

    UserDto doRegister(UserDto userDto);
}
