package com.example.recyclerviewcardview.Models;

public class TaskModel {
    private int id ,status;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public TaskModel(int id,int status,String task) {
        this.id=id;
        this.status= status;
        this.task = task;
    }

}
