package com.cotae.platform.board.practice.aggregate.board.infrastructure;

import com.cotae.platform.board.practice.aggregate.board.dao.BoardDAO;
import com.cotae.platform.board.practice.aggregate.board.entity.BoardEntity;
import com.cotae.platform.board.practice.aggregate.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardInfraStructureImpl implements BoardInfraStructure{

    private final BoardDAO boardDAO; //bean 주입 생성자 주입.



//    @Override
//    public BoardDTO selectBoardById() {
//        BoardEntity entity = this.boardDAO.findById(idx);// PK로 where를 쓴 것과 같다.
////        BoardEntity entity = this.boardDAO.findByIdx(idx)
////                .orElseThrow();
//        return new BoardDTO(entity.getIdx(),entity.getTitle(), entity.getContent());
//        return null;
//    }

    @Override
    public List<BoardDTO> selectBoardAll() {
        List<BoardEntity> entities = this.boardDAO.findAll();
        return entities.stream()// 자바 stream 공부 해볼것.0
                .map(entity ->
                    new BoardDTO(entity.getIdx(),entity.getTitle(),entity.getContent()))
                .collect(Collectors.toList());

    }

//    @Override
//    public BoardDTO selectBoardById() {
//        return null;
//    }

    @Override
    public BoardDTO insertBoard() {
        return null;
    }




}
