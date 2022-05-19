package ru.javalang.module07;

public class Student extends Person {
    private String nickName;
    private String groupName;
    private String school;

    public Student() {}

    public Student(String firstName, String middleName, String lastName){
        super(firstName, middleName, lastName);
    }

    public Student(String firstName, String middleName, String lastName, String groupName, String school) {
        super(firstName, middleName, lastName);
        this.groupName = groupName;
        this.school = school;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void printReport(){
        System.out.println("Метод printReport() из класса Student");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student{" +
                "nickName='" + nickName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
