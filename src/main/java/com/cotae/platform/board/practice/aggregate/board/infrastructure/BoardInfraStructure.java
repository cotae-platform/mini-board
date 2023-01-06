package com.cotae.platform.board.practice.aggregate.board.infrastructure;

import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;

import java.util.List;

public interface BoardInfraStructure {


    List<BoardDTO> selectBoardAll();
//    BoardDTO selectBoardById();

    BoardDTO insertBoard();


}
