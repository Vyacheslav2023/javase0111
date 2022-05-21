package ru.javalang.module12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sample1202 {
    public static void main(String[] args) throws IOException {
        // Копируем файл
        Files.copy(Paths.get("FilesTest.java"), new FileOutputStream("a.txt"));

        // Определяем, является ли файл FilesTest.java скрытым
        System.out.println ("Является ли FilesTest.java скрытым файлом:" + Files.isHidden (Paths.get ("FilesTest.java")));

        // Чтение всех строк файла FilesTest.java одновременно
        List<String> lines = Files.readAllLines(Paths.get("FilesTest.java"), Charset.forName("gbk"));
        System.out.println(lines);

        // Получить размер указанного файла
        System.out.println ("Размер FilesTest.java:"
        + Files.size(Paths.get("FilesTest.java")));

        // Напрямую записываем содержимое нескольких строк в указанный файл
        List<String> poem = new ArrayList<>();
        poem.add ("Серебряная рыбка прыгает на дно хрустального бассейна");
        poem.add ("Полюс пересекается в Цин Сюй Фэн");
        Files.write(Paths.get("pome.txt") , poem, Charset.forName("gbk"));

        // Использование нового потока Java 8 для вывода списка всех файлов и подкаталогов в текущем каталоге
        Files.list(Paths.get(".")).forEach(path -> System.out.println(path));
        // Использование нового потока Java 8 для чтения содержимого каждой строки в файле
        Files.lines(Paths.get("FilesTest.java") , Charset.forName("gbk")).forEach(line -> System.out.println(line));

        // Получить общее пространство диска C, доступное пространство
        FileStore cStore = Files.getFileStore(Paths.get("C:"));
        System.out.println ("C: Общее пространство:" + cStore.getTotalSpace ());
        System.out.println ("C: Доступное пространство:" + cStore.getUsableSpace ());

    }
}
