package ru.javalang.module07;

public class Sample708 {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] =  new Person();
        people[1] =  new Student();
        people[0].printReport(); // Метод printReport()
        people[1].printReport(); // Метод printReport() из класса Student
    }
}
