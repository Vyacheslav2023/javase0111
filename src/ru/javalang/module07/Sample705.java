package ru.javalang.module07;

public class Sample705 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Person("Иван", "Иванович","Иванов");
        people[1]=new Teacher("Мария","Ивановна","Лис","Профессор");
        people[2]=new Student("Василий","Николаевич","Пупкин","Г-202201","ВШЭ");
        people[3]=new Student("Николай","Алексеевич","Петров","Г-202202","ЕНШ");
        //...

        for (int i = 0; i < 4; i++) {
            System.out.println(people[i].getFullName()
                    + ": " + checkPersonType(people[i]));
        }
    }

    public static String checkPersonType(Person person){

        if(person instanceof Teacher){
            return "Преподаватель";
        } else if (person instanceof Student) {
            return "Студент";
        } else {
            return "Сотрудник";
        }
    }
}
