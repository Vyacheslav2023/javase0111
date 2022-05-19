package ru.javalang.module07;

public abstract class AbstractCourse {
    private String name;

    public abstract void changeTeacher(Long id);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
