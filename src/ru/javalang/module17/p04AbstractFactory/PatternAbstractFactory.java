package ru.javalang.module17.p04AbstractFactory;

public class PatternAbstractFactory {
}

interface Mouse{
    void click();
    void dblclick();
    void scroll(int direction);
}

interface Keyboard{
    void print();
    void println();
}

interface Touchpad{
    void track(int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
