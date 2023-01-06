package com.cotae.platform.practice.aggregate.board.dto;

import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Data
public class BoardDTO {

    private int idx;
    private String title;
    private String content;

//    @Builder
//    public BoardRequestDto(int idx, String title, String content){
//
//    }


}
