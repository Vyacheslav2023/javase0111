package ru.javalang.module14.example01;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private Gender gender;
    private int age;

    public User() {}

    public User(String name, Gender gender) { this.name = name; this.gender = gender; }

    public User(String name, Gender gender, int age) { this(name,gender); this.age = age; }

    public User(int id, String name, Gender gender, int age) {
        this(name, gender, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

enum Gender {
    MALE,
    FEMALE
}