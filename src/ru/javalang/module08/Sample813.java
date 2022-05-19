package ru.javalang.module08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@interface Description {
    String title();
    int version() default 1;
    String text();
}

@Description(title = "Пример аннотации", version = 2, text = "Пример с 3 параметрами")
public class Sample813 {

    public static void main(String[] args) {
        new Sample813();
    }

    Sample813(){
        getDescriptionAnnotation();
    }

    public void getDescriptionAnnotation(){
        Class<?> clazz = getClass();

        if(clazz.isAnnotationPresent(Description.class)){
            Description description = clazz.getAnnotation(Description.class);
            System.out.println(description.title());
            System.out.println(description.version());
            System.out.println(description.text());
        }
    }
}
