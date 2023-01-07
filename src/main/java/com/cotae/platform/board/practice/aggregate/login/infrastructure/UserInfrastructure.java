package com.cotae.platform.board.practice.aggregate.login.infrastructure;

import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;

public interface UserInfrastructure {

    UserDto selectUserByEmail(String email);
    boolean isExistsByEmail(String email);
    UserDto insertNewUser(UserDto user);
}
