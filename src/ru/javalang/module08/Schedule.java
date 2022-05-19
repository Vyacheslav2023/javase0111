package ru.javalang.module08;

public interface Schedule {

    default void wakeUp() { checkTime(7); }
    private void haveBreakfast() { checkTime(9); }
    static void workOut() { checkTime(18); }

    private static void checkTime(int hour) {
        if (hour> 17) {System.out.println("Вы опоздали!");}
        else {
            System.out.println("У Вас осталось "+(17-hour)+" до встречи!");
        }
    }
}