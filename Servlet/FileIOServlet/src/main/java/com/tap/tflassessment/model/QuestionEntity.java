package com.tap.tflassessment.model;

public class QuestionEntity {

    private int id;
    private String title;

    public QuestionEntity() {
        this.id = 0;
        this.title = "Java";
    }

    public QuestionEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

}
