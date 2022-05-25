package ru.javalang.module08;

public class Sample805 implements MyData{

    //    @Override // Приводит к ошибке
    public boolean isNull(String str) {
        System.out.println("Проверяем на null");
        return str == null ? true : false;
    }

    public static void main(String[] args) {
        Sample805 myDataImplement = new Sample805();
        myDataImplement.print("");
        myDataImplement.isNull("abc");
        boolean result =  MyData.isNull("abc");
    }
}
