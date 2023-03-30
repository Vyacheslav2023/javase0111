package ru.javalang.module10.tasks.t01;

public class Main {
    public static void main(String[] args) {
        int a=5, b=0;
        try {System.out.println(a/b);}
        catch (Exception ee) {System.out.println("Na nol delit nelzya. Oshibka: "+ee);}
        finally {System.out.println("Konec programmy!");}
    }

}
