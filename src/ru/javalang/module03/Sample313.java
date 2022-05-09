package ru.javalang.module03;

/**
 * Оператор return
 */
public class Sample313 {
    public static void main(String[] args) {

        boolean t = true;

        System.out.println("До возврата");

        if(t) return;

        //Далее не выполняется

        System.out.println("UNREACHABLE");
    }
}
