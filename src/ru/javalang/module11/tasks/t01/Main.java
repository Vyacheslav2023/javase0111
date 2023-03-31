package ru.javalang.module11.tasks.t01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try {
            System.out.println("Введите первое число:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Введите второе число:");
            int b = Integer.parseInt(br.readLine());
            System.out.println("Привет, " + (a+b));
        } catch (IOException e){
            System.err.println("Err " + e);
        }
    }
}
