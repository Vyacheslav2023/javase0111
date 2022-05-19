package ru.javalang.module06;

import ru.javalang.module06.geometry.Circle;
import ru.javalang.module06.geometry.Point2D;

public class Sample603 {
    public static void main(String[] args) {

        // Создание объекта окружность с пустым конструктором
        Circle circle1 = new Circle();

        // circle1.r = 10.0 // недоступно из-за модификатора private

        // Создание объекта точки с конструктором
        Point2D point = new Point2D(10,10);

        // Создание объекта окружность с конструктором с радиусом
        Circle circle2 = new Circle(10.0);
        // circle2.point = point; // недоступно из-за модификатора доступа

        // Объект окружность создан с конструктором, вклюдчающим 2 параметра
        Circle circle3 = new Circle(10.0, point);

    }
}
