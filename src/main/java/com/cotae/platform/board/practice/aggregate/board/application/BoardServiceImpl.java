package com.cotae.platform.board.practice.aggregate.board.application;

import com.cotae.platform.board.practice.aggregate.board.domain.BoardDomain;
import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDomain boardDomain;


    @Override
    public List<BoardDTO> getBoardList() {
//        BoardDTO boardDTO = boardDomain.selectBoardAll();

        return null;
    }

    @Override
    public BoardDTO selectBoard(String id) {
//        return this.boardDomain.selectBoardById(id);
        return null;
    }




//    BoardDTO selectBoard(id);
//    List<BoardEntity> getBoardList();
//    void insertBoard(BoardEntity entity);

}
