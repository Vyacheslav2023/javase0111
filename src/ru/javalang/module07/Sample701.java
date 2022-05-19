package ru.javalang.module07;

import java.time.LocalDate;

public class Sample701 {
    public static void main(String[] args) {
        Person teacher1 = new Teacher("Иванов", "Иван", "Иванович","Professor");
        teacher1.setPhoneNumbers("+79211357900");
        System.out.println(teacher1);

        Person student1 = new Student("Вася","Владимирович","Пупкин");
        student1.setBirtday(LocalDate.of(2000,1,1));
        Person student2 = new Student("Миша","Михайлович","Михайлов");
        student2.setBirtday(LocalDate.of(2000,10,10));
    }
}
