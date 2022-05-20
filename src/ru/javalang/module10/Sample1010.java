package ru.javalang.module10;

public class Sample1010 {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено " + e) ;
        }

        System.out.println("ПРодолжение выполнения программы ...");
    }

    static void compute(int a) throws MyException {

        System.out.println("Вызван compute(" + a + ")");

        if(a > 10) throw new MyException(a);

        System.out.println("Нормальное завершение");
    }
}

class MyException extends Exception {

    private int detail;

    public  MyException(int a) {
        detail = a;
    }

    public String toString() {

        return "MyException[" + detail +"]";

    }
}