package ru.javalang.module08.generics;

public class Rectangle<T extends Number> extends Shape<T> {

    private T a, b;

    public Rectangle(){
        super();
    }

    Rectangle(T a, T b, T x, T y) {
        super(x, y);
        this.a=a;
        this.b=b;
//        System.out.println("Создан прямоугольник в точке (" + x + "," + y + "), со сторонами:");
//        System.out.print("а = " + a);
//        System.out.println(", b = " + b);
    }

    Rectangle(T a, T b) {
        this.a=a;
        this.b=b;
//        System.out.println("Создан прямоугольник в точке (" + x + "," + y + "), со сторонами:");
//        System.out.print("а = " + a);
//        System.out.println(", b = " + b);
    }

    public <T> T getA(){
        return (T) this.a;
    }

    public <T> T getB(){
        return (T) this.b;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат:");
        System.out.println("Опорная точка (x = " + super.getPoint2D().getX()
                + ", y = " + super.getPoint2D().getY() + ");");
        System.out.println("Стороны: a = " + a + ", b = " + b + ";");

    }

    @Override
    public void getParams() {
        if(a.equals(b))
            System.out.println("Квадрат:");
        else
            System.out.println("Прямоугольник");

        System.out.println("Опорная точка (x = " + super.getPoint2D().getX()
                + ", y = " + super.getPoint2D().getY() + ");");
        System.out.println("Стороны: a = " + a + ", b = " + b + ";");
    }
}
