package com.cotae.platform.board.practice.aggregate.board.domain;

import com.cotae.platform.board.practice.aggregate.board.entity.BoardEntity;

import java.util.List;

public interface BoardServiceImpl {


    List<BoardEntity> getBoardList();
    void insertBoard(BoardEntity entity);

}
