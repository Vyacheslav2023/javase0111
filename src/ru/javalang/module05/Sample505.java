package ru.javalang.module05;

/**
 * Проверка на равенство строк
 */
public class Sample505 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=new String("Hello");
        if(str1 == str2) System.out.println("Строки равны");
        else  System.out.println("Строки разные!");

        str2 = str2.intern();
        if(str1 == str2) System.out.println("Строки равны");
        else  System.out.println("Строки разные!");

        if(str1.equals(str2)) System.out.println("Строки равны");
        else  System.out.println("Строки разные");
    }
}
