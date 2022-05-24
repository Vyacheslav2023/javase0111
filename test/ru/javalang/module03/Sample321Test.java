package ru.javalang.module03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sample321Test {

    @Test
    public void sum() {

        int x=2,y=2;

        Assert.assertEquals((x+y),Sample321.sum(x,y));
    }

    @Test
    public void testSum() {
    }
}