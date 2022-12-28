package com.cotae.platform.practice.aggregate.board.application;


import com.cotae.platform.practice.aggregate.board.dao.BoardDAO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;

public class BoardService {

    @Override
    void insertBoard(BoardEntity entity){
        boardDAO.insertBoard(entity);
    }
    @Override
    public List<BoardEntity> getBoardList() {
        return boardDAO.getBoardList();
    }


}
