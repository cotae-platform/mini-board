package com.cotae.platform.board.practice.aggregate.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor

@Data
public class BoardDTO {

    private int idx;
    private String title;

    private String content;



//    @Builder
//    public BoardRequestDto(int idx, String title, String content){
//            .setIdx(1).setTitle("1").setContent("2").build();//
//    }

}
