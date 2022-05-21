package ru.javalang.module17.callback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeClass {

    String replyTo;

    interface Callback{
        void callingBack(String s);
    }

    Callback callback;

    public void registerCallback(Callback callback){
        this.callback = callback;
    }

    void doSomething(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            replyTo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(replyTo.equals("y") ? "Правильный ответ" : "Неверный ответ");

        callback.callingBack(replyTo);
    }
}
