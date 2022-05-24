package ru.javalang.module04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcualtorUtilsTest {

    private CalcualtorUtils calcualtorUtils;
    private int a, b;

    @Before
    public void setUp() {
        calcualtorUtils = new CalcualtorUtils();
        a = 15; b = 5;
    }

    @Test
    public void add() {

        assertEquals((a+b),calcualtorUtils.add(a,b));

    }


    @Test
    public void sub() {
        assertEquals((a-b),calcualtorUtils.sub(a,b));
    }

    @Test
    public void multy() {
        assertEquals((a*b),calcualtorUtils.multy(a,b));
    }

    @Test(expected = ArithmeticException.class)
    public void divide() throws ArithmeticException{
        assertEquals((a/b),calcualtorUtils.divide(a,b));
        calcualtorUtils.divide(5,0);
    }
}