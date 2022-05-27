package ru.javalang.module08.generics;

public abstract class Shape<T extends Number> {
    private Point2D point2D;

    Shape(){}

    public Shape(Point2D point2D) {
        this.point2D = point2D;
    }

    public Shape(T x, T y){
        point2D.setX(x);
        point2D.setX(y);
    }

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(Point2D point2D) {
        this.point2D = point2D;
    }

    abstract void draw();
    abstract<T> void getParams();
}
