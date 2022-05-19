package ru.javalang.module07;

public class Sample703 {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванович","Иванов");
        Student student = new Student("Василий","Николаевич","Пупкин","Г-202201","ВШЭ");
        student.setNickName("pupkinvn");

        System.out.println(person);
        System.out.println(student);
    }
}
