package com.labs.lab306.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class BillableTask extends Task{
    private double hourlyRate;

    public BillableTask(int id,String title, String dueDate, boolean status) {
        super(id, title, dueDate, status);
    }
    public BillableTask(){
    }

    public BillableTask(int id, String title, String dueDate, boolean status, double hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }
}
