package com.cotae.platform.practice.aggregate.board.application;

import com.cotae.platform.practice.aggregate.board.application.BoardService;
import com.cotae.platform.practice.aggregate.board.dao.BoardDAO;
import com.cotae.platform.practice.aggregate.board.domain.BoardDomain;
import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDomain boardDomain;


    @Override
    public BoardDTO selectBoard(String id) {
        return this.boardDomain.selectBoardById(id);
    }




//    BoardDTO selectBoard(id);
//    List<BoardEntity> getBoardList();
//    void insertBoard(BoardEntity entity);

}
