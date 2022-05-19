package ru.javalang.module06;

public class Sample606 {
    public static void main(String[] args) {
        String str = "Владивосток";
        String str2 = str;
        System.out.println("str="+str+"   str2="+str2);
        str = str+" Москва";
        System.out.println("str="+str+"   str2="+str2);
    }
}
