package ru.javalang.module07;

public class StudentHelper extends PersonHelper{
    @Override
    public Student getPerson() {
        System.out.println("Student");
        return new Student();
    }
}
