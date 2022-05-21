package ru.javalang.module11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Sample1111 {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testString() {
        Example example = new Example();
        example.doSomeLogic();
        Assert.assertEquals("Test string", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}

class Example {

    public void doSomeLogic() {
        System.out.print("Test string");
    }
}