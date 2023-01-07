package com.cotae.platform.board.practice.aggregate.login.dao;

import com.cotae.platform.board.practice.aggregate.login.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
