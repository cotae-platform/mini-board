package com.cotae.platform.board.practice.aggregate.login.infrastructure;

import com.cotae.platform.board.practice.aggregate.login.dao.UserRepository;
import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;
import com.cotae.platform.board.practice.aggregate.login.entity.UserEntity;
import com.cotae.platform.board.practice.global.error.exceptions.LoginErrorCodeImpl;
import com.cotae.platform.board.practice.global.error.exceptions.LoginExceptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserInfrastructureImpl implements UserInfrastructure{

    private final UserRepository repository;

    @Override
    public UserDto selectUserByEmail(String email) {
        UserEntity entity = repository.findById(email)
                .orElseThrow(()-> new LoginExceptions(LoginErrorCodeImpl.USER_NOT_EXISTS));
        return new UserDto(entity.getEmail(), entity.getPassword(), entity.getUserName());
    }

    @Override
    public boolean isExistsByEmail(String email) {
        return this.repository.existsById(email);
    }

    @Override
    public UserDto insertNewUser(UserDto user) {
        this.repository.save(new UserEntity(user.getEmail(),user.getPassword(),user.getUserName()));
        return user;
    }
}
