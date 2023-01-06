package com.cotae.platform.practice.aggregate.board.infrastructure;

import com.cotae.platform.practice.aggregate.board.dao.BoardDAO;
import com.cotae.platform.practice.aggregate.board.dto.BoardDTO;
import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardInfraStructureImpl implements BoardInfraStructure{

    private final BoardDAO boardDAO; //bean 주입 생성자 주입.


    public BoardDTO selectBoardAll(){
        List<BoardEntity>  entity = this.boardDAO.findAll(BoardEntity, Integer); // 리스트로 받은걸 어떻게 ㅓㅁ겨줘야하지?
        return null; // 받는거 없는데?
    }

    @Override
    public BoardDTO selectBoardById(String id) {
        BoardEntity entity = this.boardDAO.findById(id)
                .orElseThrow();
        return new BoardDTO(entity.getId(),entity.getUserName());
    }
}
