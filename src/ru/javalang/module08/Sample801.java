package ru.javalang.module08;

import ru.javalang.module08.geometry.Circle;
import ru.javalang.module08.geometry.Rectangle;

public class Sample801 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,30);
        rectangle.draw();

        Circle circle = new Circle(50);
        circle.draw();
    }
}
