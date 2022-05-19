package ru.javalang.module08;

public class Sample810 {
    public static void main(String[] args) {
        Student student = new Student("Pupkin","G202201","ScienceSchool");
        Student student1 = (Student) student.clone();
        System.out.println(student1);
    }
}
