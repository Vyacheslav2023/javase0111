package ru.javalang.module11.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/home/gorynych/java/file01.txt"));

        List<String> stringList = new ArrayList<>();

        while (bufferedReader.ready()){
            stringList.add(bufferedReader.readLine());
        }


        for(String s:stringList){
            System.out.println(s);
        }

        bufferedReader.close();
    }
}
