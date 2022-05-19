package ru.javalang.module06;

/**
 * Сборка мусора вызовом явного метода System.gc()
 */

public class Sample604 {
    public static void main(String[] args) {

        User user1 = new User();

        user1 = null;

        User user2 = new User();

        Object u3 = user2;

        user2 = user1;

        System.gc();
    }
}
