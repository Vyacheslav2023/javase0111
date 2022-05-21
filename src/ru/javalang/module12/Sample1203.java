package ru.javalang.module12;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Sample1203 {
    public static void main(String[] args) throws IOException {
        // Просматривать все файлы и подкаталоги в каталоге g: \ publish \ codes \ 15
        Files.walkFileTree(Paths.get("g:", "publish" , "codes" , "15")
                , new SimpleFileVisitor<Path>()
                {
                    // Этот метод срабатывает при доступе к файлу
                    @Override
                    public FileVisitResult visitFile(Path file
                            , BasicFileAttributes attrs) throws IOException
                    {
                        System.out.println ("Доступ: " + file + " Файл");
                        // Найден файл FileInputStreamTest.java
                        if (file.endsWith("FileInputStreamTest.java"))
                        {
                            System.out.println ("- целевой файл был найден--");
                            return FileVisitResult.TERMINATE;
                        }
                        return FileVisitResult.CONTINUE;
                    }
                    // Этот метод срабатывает при запуске доступа к каталогу
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir
                            , BasicFileAttributes attrs) throws IOException
                    {
                        System.out.println ("Доступ: " + dir + " путь");
                        return FileVisitResult.CONTINUE;
                    }
                });
    }
}
