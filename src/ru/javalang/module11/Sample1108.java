package ru.javalang.module11;

import java.io.File;

public class Sample1108 {
    public static void main(String[] args) {
        // определяем объект для каталога
        //File dir = new File("C://java");
        File dir = new File("/home/user/java/");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
