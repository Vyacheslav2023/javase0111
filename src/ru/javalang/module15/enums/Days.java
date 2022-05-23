package ru.javalang.module15.enums;

public enum Days {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    String value;

    Days(){}
    Days(String s) { this.value = s;
    }

    public String getValue(){
        return value;
    }
}
