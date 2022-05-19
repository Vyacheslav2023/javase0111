package ru.javalang.module06;

public class Sample610 {

    private int mark = 3;

    public static int coeff = 5;

    public double getResult1() {
        return (double) coeff * mark / 100;
    }

    public static void setCoeffFloat(float c) {
        coeff = (int) (coeff * c);
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    // из статического метода нельзя обратиться
    // к нестатическим полям и методам
    public static int getResult2() {
//        setMark(5);// ошибка
//        return coeff * mark / 100;// ошибка
        return coeff/100;
    }
}
