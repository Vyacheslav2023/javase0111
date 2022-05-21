package ru.javalang.module17.p05Builder;

public class PatternBuilderSimple {

    public static void main(String[] args) {

        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.MANUAL)
                .buildMaxSpeed(250)
                .build();

        System.out.println(car.toString());
    }
}

enum Transmission{
    MANUAL, AUTO
}

class CarBuilder{
    String m = "Toyota";
    Transmission t = Transmission.AUTO;
    int s = 200;

    CarBuilder buildMake(String m){
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t){
        this.t = t;
        return this;
    }

    CarBuilder buildMaxSpeed(int s){
        this.s = s;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}