package ru.javalang.module07;

public class Sample704 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Person();
        people[1]=new Teacher();
        people[2]=new Student();
        people[3]=new Student();
        //...

        // Student student1 = (Student) people[1];
        Student student2 = (Student) people[2];

        for (int i = 0; i < 4; i++) {
            System.out.println("\n" + people[i]);
        }
    }
}
