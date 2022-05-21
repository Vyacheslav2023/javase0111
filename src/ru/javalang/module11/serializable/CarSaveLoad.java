package ru.javalang.module11.serializable;

import java.io.*;

public class CarSaveLoad {
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

    public CarSaveLoad(){
    }

    public CarSaveLoad(String name, int age){
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

    public void save(OutputStream outputStream) throws Exception{
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(name);
        printWriter.println(age);
        printWriter.println(type);
        printWriter.println(color);
        printWriter.close();
    }

    public void load(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        name = bufferedReader.readLine();
        age = Integer.parseInt(bufferedReader.readLine());
        type = bufferedReader.readLine();
        color = bufferedReader.readLine();
        bufferedReader.close();
    }
}
