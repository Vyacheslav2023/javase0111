### Задание 1.1

Создайте файл CommandArg.java со следующим содержанием:

````
public class CommandArg {
  public static void main(String[] args) {
 	for(int i=0; i<args.length; i++){
  	    System.out.println("Аргумент " + i + " = " + args[i]);
	}
  }
}
````

Скомпилируйте приложение и запустите его с помощью следующей командной строки 

````

javac.exe CommandArg.java

java.exe CommandArg first second 23 56 23,9 
````