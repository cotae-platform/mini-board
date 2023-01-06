package com.cotae.platform.practice.aggregate.board.dao;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BoardDAO extends JpaRepository<BoardEntity, Integer>{ // <엔티티 클래스, PK타입>

    List<BoardEntity> findAllByIdx(List<Integer> idx);
//    @Query(Value = "INSERT INTO Board (TITLE, CONTENT) VALUS('TEST_TITLE','test_content')")
//    public List<BoardEntity> insertBoard();
//
//    List<BoardEntity> findAll() ;

}
