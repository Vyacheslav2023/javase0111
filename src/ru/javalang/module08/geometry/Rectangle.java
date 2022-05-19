package ru.javalang.module08.geometry;

import ru.javalang.module07.geometry.Point2D;

public class Rectangle implements GeometryShape{

    private double a, b;
    private Point2D point;

    public Rectangle(){this.a = 10; this.b=20;}

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }

    @Override
    public double square() {
        return a*b;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник со сторонами a и b : " + a + ", " + b );
    }

    @Override
    public void isMovable() {
        System.out.println("Rectangle is movable");
    }
}
