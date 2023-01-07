package com.cotae.platform.board.practice.aggregate.login.domain;

import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;
import com.cotae.platform.board.practice.aggregate.login.infrastructure.UserInfrastructure;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDomainImpl implements UserDomain{

    private final UserInfrastructure userInfrastructure;

    @Override
    public boolean isDuplicateEmail(String email) {
        return this.userInfrastructure.isExistsByEmail(email);
    }

    @Override
    public UserDto registerUser(UserDto user) {
        return this.userInfrastructure.insertNewUser(user);
    }


}
