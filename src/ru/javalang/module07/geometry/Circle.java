package ru.javalang.module07.geometry;

public class Circle extends GraphicObject {
    private double radius;
    private Point2D point;

    public Circle() {}

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, Point2D point) {
        this(r);
        this.point = point;
    }

    public Circle(double r, double x, double y) {
        this(r);
        this.point = new Point2D(x,y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}
