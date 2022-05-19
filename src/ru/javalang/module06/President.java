package ru.javalang.module06;

/**
 * Инициализация константных переменных
 */

public class President {

    // инициализированная константа
    final int ID = (int) (Math.random() * 10);

    // неинициализированная константа
    final String NAME;

    public President() {
        // инициализация в конструкторе
        NAME = "Старый";
        // только один раз!!!
    }

    // {NAME = "Новый";}
    // только один раз!!!

    public final void jobPresident() {
        // реализация
//         ID = 100;
        // ошибка!
    }
}
