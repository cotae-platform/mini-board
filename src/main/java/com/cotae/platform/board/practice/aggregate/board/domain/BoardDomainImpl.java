package com.cotae.platform.board.practice.aggregate.board.domain;

import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.board.practice.aggregate.board.infrastructure.BoardInfraStructure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardDomainImpl implements BoardDomain{

    private final BoardInfraStructure boardInfraStructure;


    @Override
    public List<BoardDTO> selectBoardAll(){
        List<BoardDTO> boardDTOList = this.boardInfraStructure.selectBoardAll();
        if (boardDTOList == null){
        }
        return  boardDTOList;
    }


//    public BoardDTO insertBoard(){
//
//    };

//    @Override
//    public BoardDTO selectBoardById(String id) {
//        return this.boardInfraStructure.selectBoardById(id);
//    }
}
