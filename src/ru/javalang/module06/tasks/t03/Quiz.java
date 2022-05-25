package ru.javalang.module06.tasks.t03;

import java.util.List;
import java.util.UUID;

public class Quiz {
    int id;
    String name;
    Question[] questionList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question[] getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Question[] questionList) {
        this.questionList = questionList;
    }
}
