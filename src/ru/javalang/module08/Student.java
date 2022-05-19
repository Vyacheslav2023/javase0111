package ru.javalang.module08;


public class Student implements Cloneable {
    private String nickName;
    private String groupName;
    private String school;

    public Student() {}

    public Student(String nickName, String groupName, String school) {
        this.nickName = nickName;
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
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Невозможно");
        }
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
