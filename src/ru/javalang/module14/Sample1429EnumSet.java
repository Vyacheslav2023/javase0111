package ru.javalang.module14;

import java.util.EnumSet;

enum Faculty {
    FFSM, MMF, FPMI, FMO, GEO
}

public class Sample1429EnumSet {
    public static void main(String[] args) {
        /*
         * множество set1 содержит элементы типа enum из интервала,
         * определенного двумя элементами
         */
        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF, Faculty.FMO);
        /*
         * множество set2 будет содержать все элементы, не содержащиеся _в
         * множестве set1
         */
        EnumSet<Faculty> set2 = EnumSet.complementOf(set1);
        System.out.println(set1);
        System.out.println(set2);
    }
}
