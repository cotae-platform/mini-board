package com.cotae.platform.practice.aggregate.board.entity;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity(name = "Board")
public class BoardEntity {


    @Id
    @Column(name = "IDX")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idx;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "WRITER")
    private String writer;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "REGDATE")
    private LocalDateTime regDate = LocalDateTime.now();


}
