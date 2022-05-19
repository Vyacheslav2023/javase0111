package ru.javalang.module08;

import ru.javalang.module08.geometry.Circle;
import ru.javalang.module08.geometry.GeometryShape;
import ru.javalang.module08.geometry.Rectangle;

public class Sample802 {
    public static void main(String[] args) {
        GeometryShape rectangle = new Rectangle(10,20);
//        rectangle = new GeometryShape();
        GeometryShape geometryShape;
        geometryShape = rectangle;

        System.out.println("geometryShape is " + checkShape(geometryShape));

        geometryShape = new Circle(10);

        System.out.println("geometryShape is " + checkShape(geometryShape));

        geometryShape = null;
        System.out.println("geometryShape is " + checkShape(geometryShape));
    }

    public static String checkShape(GeometryShape geometryShape){
        if(geometryShape instanceof Circle){
            return "Circle";
        } else if(geometryShape instanceof Rectangle){
            return "Rectangle";
        } else if(geometryShape instanceof GeometryShape){
            return "GeometryShape";
        } else return "Other Shape";
    }
}
