package ru.javalang.module08.geometry;

public interface Movable {
    default void isMovable(){
        System.out.println("Interface Movable");
    }
}
