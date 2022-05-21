package ru.javalang.module17.p11ChainOfResponsibility;

//Example Logger-system

import java.io.FileReader;

public class ChainOfRespApp {
    public static void main(String[] args) {
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);
        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("It's OK!",Level.INFO);
        logger0.writeMessage("debug mode",Level.DEBUG);
        logger0.writeMessage("SystemError!", Level.ERROR);


    }
}

class Level{
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

interface Logger{
    void writeMessage(String message, int level);
    void setNext(Logger next);
}

class SMSLogger implements Logger {

    int priority;

    public SMSLogger(int priority) { this.priority = priority; }

    Logger next;

    public void setNext(Logger next) { this.next = next; }

    @Override
    public void writeMessage(String message, int level) {
        if(level <= priority){
            System.out.println("SMS: " + message);;
        }
        if(next != null){
            next.writeMessage(message, level);
        }
    }


}

class FileLogger implements Logger {

    int priority;

    public FileLogger(int priority) { this.priority = priority; }

    Logger next;

    public void setNext(Logger next) { this.next = next; }

    @Override
    public void writeMessage(String message, int level) {
        if(level <= priority){
            System.out.println("Write to file: " + message);;
        }
        if(next != null){
            next.writeMessage(message, level);
        }
    }
}

class EmailLogger implements Logger {

    int priority;

    public EmailLogger(int priority) { this.priority = priority; }

    Logger next;

    public void setNext(Logger next) { this.next = next; }

    @Override
    public void writeMessage(String message, int level) {
        if(level <= priority){
            System.out.println("EMail message: " + message);;
        }
        if(next != null){
            next.writeMessage(message, level);
        }
    }
}