package ru.javalang.module07;

import java.util.List;

public class Teacher extends Person{
    private String degree;
    private List<String> disciplines;
    private List<String> school;

    public Teacher() {}

    public Teacher(String firstName, String middleName, String lastName, String degree) {
        super(firstName,middleName,lastName);
        this.degree=degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<String> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<String> disciplines) {
        this.disciplines = disciplines;
    }

    public List<String> getSchool() {
        return school;
    }

    public void setSchool(List<String> school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Teacher{" +
                "degree='" + degree + '\'' +
                ", disciplines=" + disciplines +
                ", school=" + school +
                '}';
    }
}
