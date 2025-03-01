package com.labs.lab306.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String dueDate;
    private boolean status;

    public Task(int id, String title, String dueDate, boolean status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }
    public Task(){

    }
}
