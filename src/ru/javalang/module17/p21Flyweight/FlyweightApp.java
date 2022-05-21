package ru.javalang.module17.p21Flyweight;


import java.util.*;

//Flyweight Pattern implementation
public class FlyweightApp {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("rect"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("rectangle"));

        Random rand = new Random();
        for(Shape shape : shapes){
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x,y);
        }
    }
}

//Flyweight interface block
interface Shape {
    void draw(int x, int y);
}

class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Point draws with coordinats: x = " + x + ", y = " + y);
    }
}

class Circle implements Shape{

    int radius;

    @Override
    public void draw(int x, int y) {
        System.out.println("Circle draws");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Rectangle draws");
    }
}

class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){
        Shape shape = shapes.get(shapeName);
        if(shape == null){
            switch (shapeName){
                case "point":
                    shape = new Point();
                    break;
                case "circle":
                    shape = new Circle();
                    break;
                case "rectangle":
                    shape = new Rectangle();
                    break;
                case "rect":
                    shape = new Rectangle();
                    break;
            }
            shapes.put(shapeName,shape);
        }
        return shape;
    }


}