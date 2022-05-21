package ru.javalang.module17.p05Builder;

abstract class AbstractCarBuilder {
    Car car;
    void createCar() { car = new Car(); }
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();
    Car getCar() { return car; }
}

class FordBuilder extends AbstractCarBuilder{
    @Override
    void buildMake() {
        car.setMake("Ford");
    }
    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }
}

class NissanBuilder extends AbstractCarBuilder{
    @Override
    void buildMake() {
        car.setMake("Nissan");
    }
    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(150);
    }
}

class Director {
    AbstractCarBuilder carBuilder;
    void setCarBuilder(AbstractCarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildMake();
        carBuilder.buildMaxSpeed();
        carBuilder.buildTransmission();

        Car car = carBuilder.getCar();
        return car;
    }
}