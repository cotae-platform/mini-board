package com.cotae.platform.board.practice.aggregate.board.api;

import com.cotae.platform.board.practice.aggregate.board.application.BoardService;
import com.cotae.platform.board.practice.aggregate.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardApi {
    private final BoardService boardService;

    //Constructor Injections
    @RequestMapping("/readBoard.do")
    public void readBoard(BoardEntity boardEntity, Model model){
//        List<BoardEntity> boardList = BoardService.구현체 이름();
    }
    @RequestMapping("/insertBoard.do")
    public void insertBoard(BoardEntity boardEntity, Model model){
    }

}
