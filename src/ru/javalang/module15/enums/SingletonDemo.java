package ru.javalang.module15.enums;

public enum SingletonDemo {
    INSTANCE;

    public void method(){
        System.out.println("Method from singleton");
    }
}
