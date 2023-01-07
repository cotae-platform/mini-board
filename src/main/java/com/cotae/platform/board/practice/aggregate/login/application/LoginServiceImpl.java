package com.cotae.platform.board.practice.aggregate.login.application;

import com.cotae.platform.board.practice.aggregate.login.domain.UserDomain;
import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;
import com.cotae.platform.board.practice.global.error.exceptions.LoginErrorCodeImpl;
import com.cotae.platform.board.practice.global.error.exceptions.LoginExceptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService{

    private final UserDomain userDomain;

    @Override
    @Transactional
    public UserDto doRegister(UserDto userDto) {
        // 중복 가입여부를 먼저 체크한다.
        if(this.userDomain.isDuplicateEmail(userDto.getEmail())){
            log.error("User Email is duplicated.");
            throw new LoginExceptions(LoginErrorCodeImpl.USER_EMAIL_DUPLICATED);
        }
        //중복해서 가입하지 않았다면, DB 에 User 삽입하고 Return.
        return this.userDomain.registerUser(userDto);
    }
}
