package com.cotae.platform.aggregate.board.dto;

import com.cotae.platform.practice.aggregate.board.entity.BoardEntity;
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
