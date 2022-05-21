package ru.javalang.module17.p13Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorApp {
    public static void main(String[] args) {

    }
}

interface Person{
    void sendMessage(String message);
    void getMessage(String message);
}

class Admin implements Person {

    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администратор получает сообщение '" + message + "'");
    }
}

class User implements Person {

    Chat chat;

    public User(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь получает сообщение '" + message + "'");
    }
}

interface Chat{
    void sendMessage(String message, Person person);
}

class TextChat implements Chat{
    Person admin;

    List<Person> users = new ArrayList<>();

    public void setAdmin(Person admin){
        this.admin = admin;
    }

    public void addUser(Person user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, Person person) {

    }
}