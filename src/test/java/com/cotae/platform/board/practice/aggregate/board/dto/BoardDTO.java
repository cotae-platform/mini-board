package com.cotae.platform.board.practice.aggregate.board.dto;

import lombok.Data;

import java.util.Date;


@Data
public class BoardDTO {

    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int cnt;




//    public ResponseEntity BoardApi(@RequestParam() String title
//            , @RequestParam() String content) {
//        if (true);
//        Map<String, String> map = new HashMap<>();
//
//
//        map.put("title", title);
//        map.put("content", content);
//        return new ResponseEntity<>(map, HttpStatus.CREATED);
//    }

}
