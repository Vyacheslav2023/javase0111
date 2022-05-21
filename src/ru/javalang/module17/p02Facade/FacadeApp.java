package ru.javalang.module17.p02Facade;

public class FacadeApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}

class Car{

    CarEngine carEngine = new CarEngine();
    CarWheels carWheels = new CarWheels();

    void startCar(){
        carWheels.isReady();
        carEngine.startEngine();
    }

    void stopCar(){
        carWheels.isNotReady();
        carEngine.stopEngine();
    }
}

class CarEngine{
    void startEngine(){
        System.out.println("Engine is run.");
    }

    void stopEngine(){
        System.out.println("Engine is stop.");
    }
}

class CarWheels{
    void isReady(){
        System.out.println("Wheels is ready");
    }

    void isNotReady(){
        System.out.println("Wheels is not ready.");
    }
}
