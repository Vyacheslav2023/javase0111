package ru.javalang.module07;

import java.time.LocalDate;

public class Person {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birtday;
    private String phoneNumber;

    public Person() {}

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    public String getPhoneNumbers() {
        return phoneNumber;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumber = phoneNumbers;
    }

    public final String getFullName(){
        return firstName + " " + middleName + " " + lastName;
    }

    public static void printReport(){
        System.out.println("Метод printReport()");
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtday=" + birtday +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
