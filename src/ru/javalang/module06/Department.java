package ru.javalang.module06;

public class Department {

    public final static String NAME;

    {
        System.out.println("логический блок (1) id=" + this.id);
    }

    static {
        NAME = "Новое подразделение";
        System.out.println("статический блок (1): " + NAME);
    }

    private int id = 7;

    {
        System.out.println("логический блок (2) id=" + this.id);
    }

    public Department(int d) {
        id = d;
        System.out.println("конструктор id=" + id);
    }

    int getId() {
        return id;
    }

    {
        id = 10;
        System.out.println("логический блок (3) id=" + id);
    }
}
