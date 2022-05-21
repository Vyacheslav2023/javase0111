package ru.javalang.module11;

import java.io.File;

public class Sample1109 {
    public static void main(String[] args) {
        // определяем объект для каталога
        //File dir = new File("C://java//NewDir");
        File dir = new File("/home/user/java/NewDir");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        // переименуем каталог
        //File newDir = new File("C://java//NewDirRenamed");
        File newDir = new File("/home/user/java/NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");
    }
}
