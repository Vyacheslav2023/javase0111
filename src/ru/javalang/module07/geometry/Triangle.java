package ru.javalang.module07.geometry;


public class Triangle extends GraphicObject {

    int a, b, c;

    Triangle(final int a, final int b, final int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Создан треугольник со сторонами:");
        System.out.print("а = " + a);
        System.out.print("b = " + b);
        System.out.println("c = " + c);
    }

    @Override
    public void draw() {

    }
}
