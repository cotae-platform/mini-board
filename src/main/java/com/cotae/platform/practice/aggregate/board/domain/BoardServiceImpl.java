package com.cotae.platform.practice.aggregate.board.domain;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;

import java.util.List;

public interface BoardServiceImpl {

    BoardDTO selectBoard(id);
    List<BoardEntity> getBoardList();
    void insertBoard(BoardEntity entity);

}
