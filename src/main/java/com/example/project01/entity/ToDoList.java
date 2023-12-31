package com.example.project01.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "todolist")
@RequiredArgsConstructor

public class ToDoList {
    @Id
    @GeneratedValue
    @Column(name = "todolist_id")
    private Long id;
    private String memo;

    public ToDoList(Long id) {
        this.id = id;
    }
}