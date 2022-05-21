package ru.javalang.module12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample1201 {
    public static void main(String[] args) {
        // Создать объект Path с текущим путем
        Path path = Paths.get(".");

        // Получить абсолютный путь, соответствующий пути.
        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath); // “D:\java_project\Test\sources\.”

        // Получить корневой путь абсолютного пути
        System.out.println ("корневой путь absolutePath:" + absolutePath.getRoot ()); // "D: \"

        // Получить количество путей, содержащихся в абсолютном пути
        int iCnt = absolutePath.getNameCount();
        System.out.println ("Количество путей, содержащихся в absolutePath:" + iCnt); // 4
        for(int i = 0; i < iCnt; ++i)
            System.out.println(absolutePath.getName(i));// “java_project”、“Test”、“sources”、“.”

        // Построить объект Path с несколькими строками
        Path path2 = Paths.get("g:" , "publish" , "codes");
        System.out.println(path2); //“g:\publish\codes”

    }
}

//Используя регистрацию Path (), можно отслеживать изменения файлов в каталоге, представленном Path.