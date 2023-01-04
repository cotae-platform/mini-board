package com.cotae.platform.practice.aggregate.board.domain;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;

public interface BoardDomain {

    BoardDTO selectBoardById(String id);
}
