package com.cotae.platform.practice.aggregate.board.dao;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    private jpa; // infrastructure 연결


    public void insertBoard(BoardDTO boardDTO){ // 보드 생성
        "JPA를 이용한 insert문"
    }


    public List<BoardEntity> getBoardList(){ // 보드 조회
        "전체 조회문"
    }
}
