package ru.javalang.module17.p06Prototype;

// This patterns like interface Clonable from java.lang

public class PrototypeApp {
    public static void main(String[] args) {
        Human human = new Human(18, "Vasya");
        System.out.println(human);

        Human humancopy = (Human) human.copy();
        System.out.println(humancopy);

        HumanFactory factory = new HumanFactory(humancopy);
        Human human1 = factory.makeCopy();
        System.out.println(human1);

        factory.setPrototype(new Human(30, "Maria"));
        Human woman2 = factory.makeCopy();
        System.out.println(woman2);
    }
}

interface Copyable{
    Object copy();
}

class Human implements Copyable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human [age = " + age + ", name = " + name + "]";
    }

    @Override
    public Object copy() {

        Human copy = new Human(age,name);
        return copy;
    }
}

class HumanFactory{
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human){
        this.human = human;
    }

    Human makeCopy(){
        return (Human) human.copy();
    }
}