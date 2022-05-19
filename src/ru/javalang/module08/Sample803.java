package ru.javalang.module08;

import ru.javalang.module08.geometry.Circle;
import ru.javalang.module08.geometry.GeometryShape;
import ru.javalang.module08.geometry.Rectangle;

public class Sample803 {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        circle.isMovable();

        Rectangle rectangle = new Rectangle(10,20);
        rectangle.isMovable();
    }
}
