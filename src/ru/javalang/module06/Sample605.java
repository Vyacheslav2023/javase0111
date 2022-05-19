package ru.javalang.module06;

import ru.javalang.module06.geometry.Circle;

public class Sample605 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Радиус новой окружности: " + circle.getRadius());
        changeCircle(circle);
        System.out.println("Радиус измененной окружности: " + circle.getRadius());
    }
    public static void changeCircle(Circle circle){
        System.out.println("Перед изменением радиус окружности: " + circle.getRadius());
        circle.setRadius(20);
        System.out.println("После изменения радиус равен: " + circle.getRadius());
    }
}
