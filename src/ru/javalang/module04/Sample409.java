package ru.javalang.module04;

/**
 * Попытка поместить в массив элемент другого типа
 */
public class Sample409 {
    public static void main(String[] args) {
        Object x[] = new String[3];
        // попытка поместить в массив содержимое 				//несоответствующего типа
        x[0] = new Integer(0);
    }
}
