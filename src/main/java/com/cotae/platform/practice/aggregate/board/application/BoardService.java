package com.cotae.platform.practice.aggregate.board.application;


import com.cotae.platform.practice.aggregate.board.dao.BoardDAO;
import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {


    public List<BoardDTO> getBoardList();


    BoardDTO selectBoard(String idx);




//    private final BoardDAO boardDAO;
//
//    void insertBoard(BoardEntity entity){
//        boardDAO.insertBoard(entity);
//    }
//
//    public List<BoardEntity> getBoardList() {
//        return boardDAO.getBoardList();
//    }


}
