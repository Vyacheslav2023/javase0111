package ru.javalang.module15;

record Person(String firstName, String lastName, int age, String phoneNumber){}

public class Sample1503Records {
    public static void main(String[] args) {
        Person person = new Person("Вася","Пупкин",25, "8800565656");
        System.out.println(person.firstName());
        System.out.println(person.lastName());
        System.out.println(person.age());
        System.out.println(person.phoneNumber());
    }
}
