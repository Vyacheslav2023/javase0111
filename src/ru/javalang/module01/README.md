## Модуль 1

# Введение в Java технологии

- Особенности языка программирования Java.
- Описание Java технологий.
- Использование интегрированной среды разработки.
- Практика: Установка JDK/IDE, настройка параметров среды
- Запуск простейших программ

### JDK
- [ORACLE](https://www.oracle.com/java/technologies/downloads/)
- [OpenJDK](http://jdk.java.net/)

### IDE
- [IntellijIdea](https://www.jetbrains.com/ru-ru/idea/download/)
- [Eclipse](https://www.eclipse.org/downloads/)

### Запуск программ в коммандной строке

#### Один файл исходного текста 'HelloWorld.java'
```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
#### Запуск компиляции и запуск самой программы
```
javac HelloWorld.java
java HelloWorld
```

### Включение пакетов и отделение исходных текстов от бинарных файлов
```
> cd javace01

> javac -d bin src/ru/javalang/Main.java

> java -cp ./bin ru.javalang.Main
```