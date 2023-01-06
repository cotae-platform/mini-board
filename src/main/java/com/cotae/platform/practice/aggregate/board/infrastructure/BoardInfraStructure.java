package com.cotae.platform.practice.aggregate.board.infrastructure;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;

public interface BoardInfraStructure {

    BoardDTO selectBoardAll();
    BoardDTO selectBoardById(String id);
}
