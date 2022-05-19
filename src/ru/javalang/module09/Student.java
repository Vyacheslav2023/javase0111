package ru.javalang.module09;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    public Student(Long id, String firstName, String lastName,  int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return (firstName + lastName);
    }
    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() == obj.getClass()) {
            Student temp = (Student) obj;
            return this.id == temp.id && lastName.equals(temp.lastName)
                    && this.age == temp.age;
        } else
            return false;
    }
    public int hashCode() {
        return (int) (31 * id + age
                + ((lastName == null) ? 0 : lastName.hashCode()));
    }
    public String toString() {
        return getClass().getName() + "@name"
                + lastName + " " + firstName
                + " id:" + id + " age:" + age;
    }
}
