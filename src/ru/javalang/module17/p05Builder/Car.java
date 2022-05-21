package ru.javalang.module17.p05Builder;


class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car [make = " + make + ", transmission = " + transmission
                + ", speed = " + maxSpeed + "]";
    }
}
