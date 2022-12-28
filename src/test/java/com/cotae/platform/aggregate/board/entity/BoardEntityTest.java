package com.cotae.platform.aggregate.board.entity;


import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardEntityTest {

    @Autowired
    BoardEntity boardEntity;

    @After
    public void cleanup() {
        boardEntity.deleteAll();
    }

    @Test
    public void 게시글저장_블러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        boardEntity.save(boardEntity.builder()
                .title(title)
                .content(content)
                .build());

        //when
        List<boardEntity> postsList = boardEntity.findAll();

        //then
        BoardEntity boardEntity = postsList.get(0);
        assertThat(boardEntity.getTitle()).isEqualTo(title);
        assertThat(boardEntity.getContent()).isEqualTo(content);
    }

}
