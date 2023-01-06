package com.cotae.platform.board.practice.aggregate.board.domain;

import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;

import java.util.List;

public interface BoardDomain {


    List<BoardDTO> selectBoardAll();
//    BoardDTO selectBoardById(String id);

}
