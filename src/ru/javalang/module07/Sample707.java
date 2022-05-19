package ru.javalang.module07;

import ru.javalang.module07.geometry.Circle;
import ru.javalang.module07.geometry.GraphicObject;

public class Sample707 {
    public static void main(String[] args) {
        GraphicObject graphicObject;
//        graphicObject = new GraphicObject();
        graphicObject = new Circle();
        graphicObject.draw();
    }
}
