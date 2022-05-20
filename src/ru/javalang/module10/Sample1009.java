package ru.javalang.module10;

public class Sample1009 {
    public static void main(String[] args) {
        try (Lion lion = new Lion()) {
            lion.hunt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Lion implements AutoCloseable{
    public Lion() {
        System.out.println("Лев на воле!");
    }
    public void hunt() throws Exception {
        throw new Exception("Добыча не поймана!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Лев в клетке!");
        throw new Exception("Невозможно закрыть клетку");
    }
}