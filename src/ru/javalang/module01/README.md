## Модуль 1

# Введение в Java технологии

- Особенности языка программирования Java.
- Описание Java технологий.
- Использование интегрированной среды разработки.
- Практика: Установка JDK/IDE, настройка параметров среды
- Запуск простейших программ
- Языковые лексемы Java.

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
> javac HelloWorld.java
> java HelloWorld
```

### Файл исходного текста 'HelloWorld.java' для вывода аргуметов коммандной строки
```
public class CommandArgs {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
  	        System.out.println("Аргумент " + i + " = " + args[i]);
  	    }
    }
}
```
#### Запуск компиляции и запуск самой программы
```
> javac CommandArgs.java
> java CommandArgs
```

### Включение пакетов и отделение исходных текстов от бинарных файлов
```
> cd javace01

> javac -d bin src/ru/javalang/Main.java

> java -cp ./bin ru.javalang.Main
```