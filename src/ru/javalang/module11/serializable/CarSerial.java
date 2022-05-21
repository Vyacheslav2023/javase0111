package ru.javalang.module11.serializable;

import java.io.Serializable;

public class CarSerial implements Serializable {
    private String name;
    private String type;
    private String color;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public CarSerial(){
    }

    public CarSerial(String name, int age){
        this.name=name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
