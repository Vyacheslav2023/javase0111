package ru.javalang.module11.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo03FileOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("/home/user/java/file03.txt");

        String s = "И стоит берёза\n" +
                "В сонной тишине,\n" +
                "И горят снежинки\n" +
                "В золотом огне.\n";

        fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));

        fileOutputStream.close();
    }
}
