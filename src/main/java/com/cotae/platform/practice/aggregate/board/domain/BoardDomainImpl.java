package com.cotae.platform.practice.aggregate.board.domain;

import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.infrastructure.BoardInfraStructure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDomainImpl implements BoardDomain{

    private final BoardInfraStructure boardInfraStructure;

    public BoardDTO selectBoardAll(){
        this.boardInfraStructure.
    };

    @Override
    public BoardDTO selectBoardById(String id) {
        return this.boardInfraStructure.selectBoardById(id);
    }
}
