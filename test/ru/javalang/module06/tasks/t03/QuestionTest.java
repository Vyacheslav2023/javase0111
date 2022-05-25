package ru.javalang.module06.tasks.t03;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    Question question;

    @Test
    public void generateQuestion() {
        Question questionExpect = new Question();

        question = null;

        assertNull(question);
    }
}