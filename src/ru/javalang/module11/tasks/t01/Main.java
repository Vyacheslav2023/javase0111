package ru.javalang.module11.tasks.t01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try {
            System.out.println("������� ������ �����:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("������� ������ �����:");
            int b = Integer.parseInt(br.readLine());
            System.out.println("������, " + (a+b));
        } catch (IOException e){
            System.err.println("Err " + e);
        }
    }
}
