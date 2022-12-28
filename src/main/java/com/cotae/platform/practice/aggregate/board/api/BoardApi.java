package com.cotae.platform.practice.aggregate.board.api;

import com.cotae.platform.practice.aggregate.board.application.BoardService;
import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import java.awt.*;

@Controller
public class BoardApi {
//Field Injection
    @Autowired
    private BoardService boardService;

    @RequestMapping("/readBoard.do")
    public void readBoard(BoardEntity boardEntity, Model model){
        List<BoardEntity> boardList = BoardService.구형체 이름();
    }

    @RequiredArgsConstrcutor
    public class readBoardClass{
        private final BoardDTO boardDTO;
    }

}
