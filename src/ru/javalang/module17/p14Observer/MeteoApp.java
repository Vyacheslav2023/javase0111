package ru.javalang.module17.p14Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MeteoApp {
    static public void main(String[] args) {

        Observed station1 = new MeteoStation();
        Observer observer1 = new ConsoleObserver();
        Observer observer2 = new FileObserver();

        station1.addObserver(observer1);
        station1.addObserver(observer2);
        station1.addObserver(new ConsoleObserver());
        station1.setParams(25, 760);
    }
}

//Интерфейс наблюдателя
interface Observer{
    //Обработка событий
    void handleEvent(int temp, int pressure) throws IOException;
}

//Интерфейс наблюдаемого объекта
interface Observed{

    //Добавить наблюдателя
    void addObserver(Observer o);

    //Удалить наблюдателя
    void removeObserver(Observer o);

    //Уведомить наблюдателей
    void notifyObservers();

    //Установка параметров
    void setParams(int p1, int p2);
}

//Класс метеостанция для примера
class MeteoStation implements Observed{

    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    //Метод установки параметров
    @Override
    public void setParams(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        observers.forEach(x -> {
            try {
                x.handleEvent(temperature, pressure);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

// Первый наблюдатель
class ConsoleObserver implements Observer{

    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("The weather changed: temp = " + temp + " , pressure = " + pressure);
    }
}

//Второй наблюдатель
class FileObserver implements Observer{

    @Override
    public void handleEvent(int temp, int pressure) throws IOException {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("The weather changed: temp = " + temp + " , pressure = " + pressure);
            printWriter.println();
            printWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}