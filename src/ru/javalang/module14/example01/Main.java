package ru.javalang.module14.example01;

public class Main {
    public static void main(String[] args) {


        UserList.userAdd("Вася", Gender.MALE, 20);
        UserList.userAdd("Оля", Gender.FEMALE, 18);
        UserList.userAdd("Маша", Gender.FEMALE, 25);
        UserList.userAdd("Коля",Gender.MALE, 35);
        UserList.userAdd("Олег",Gender.MALE, 30);

        System.out.println("Пользователи: ");
        UserList.getAllUsers().forEach(System.out::println);

        System.out.println("\nСредний возраст всех пользователей:");
        System.out.println(UserList.getAverageAgeOfAllUsers());

        System.out.println("\nВсе male:");
        System.out.println(UserList.usersByGender(Gender.MALE));

        System.out.println("\nВсе female:");
        System.out.println(UserList.usersByGender(Gender.FEMALE));
    }
}
