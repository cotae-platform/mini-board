package com.cotae.platform.board.practice.aggregate.board.application;


import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;

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
