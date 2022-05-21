package ru.javalang.module13.startthread;

public class Demo02Runnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Привет из основного потока");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("НОВЫЙ ПОТОК RUNNABLE");
        System.out.println(Thread.currentThread().getName());
    }
}
