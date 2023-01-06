package com.cotae.platform.board.practice.aggregate.board.dao;

import com.cotae.platform.board.practice.aggregate.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardDAO extends JpaRepository<BoardEntity, Integer>{ // <엔티티 클래스, PK타입>


}
