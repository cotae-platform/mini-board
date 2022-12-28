package com.cotae.platform.aggregate.board.domain;

import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;

import java.util.List;

public interface BoardServiceImpl {


    List<BoardEntity> getBoardList();
    void insertBoard(BoardEntity entity);

}
