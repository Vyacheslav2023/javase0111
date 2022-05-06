package ru.javalang.module01;

/**
 * Пример вывода аргуметов коммандной строки
 */
public class Sample12 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg["+i+"] = " + args[i]);
        }
    }
}
