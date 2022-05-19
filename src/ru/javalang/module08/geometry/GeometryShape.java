package ru.javalang.module08.geometry;

public interface GeometryShape extends Movable {

    double PI = 3.1415926;

    public abstract double perimeter();

    double square();

    void draw();

    default void isMovable(){
        Movable.super.isMovable();
        System.out.println("This shape is movable");
    }

    public interface InnerSquare {
        double innerSquare();
    }
}
