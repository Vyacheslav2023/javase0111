package ru.javalang.module17.p07Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.addComponents(new Triangle());
        composite.addComponents(new Circle());
        composite.addComponents(new Rectangle());

        Composite composite1 = new Composite();
        composite1.addComponents(composite);
        composite1.addComponents(composite);
        composite1.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат!");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник!");
    }
}


class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Рисуем круг!");
    }
}

class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    public void addComponents(Shape component){
        components.add(component);
    }

    public void removeComponents(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        for(Shape component: components){
            component.draw();
        }
    }
}
