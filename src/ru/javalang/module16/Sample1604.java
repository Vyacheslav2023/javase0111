package ru.javalang.module16;

public class Sample1604 {
    public static void main(String[] args) {
        Operationable operation = (int x, int y)-> {

            if(y==0)
                return 0;
            else
                return x/y;
        };
    }
}

interface Operationable{
    int calculate(int x, int y);
}