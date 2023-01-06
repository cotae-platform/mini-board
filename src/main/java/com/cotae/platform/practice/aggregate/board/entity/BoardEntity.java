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
@Entity
public class BoardEntity {


    @Id
    @Column()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idx;
    @Column()
    private String title;
    @Column(columnDefinition ="TEXT")
    private String content;


}
