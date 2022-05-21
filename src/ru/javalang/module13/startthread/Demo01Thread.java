package ru.javalang.module13.startthread;

public class Demo01Thread {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        myThread1.start();

//        new Thread(()-> System.out.println("Hello from " + Thread.currentThread().getName())).start();

        System.out.println("Основная программа, метод main()");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Запуск дополнительного потока: " + getName());
    }
}
