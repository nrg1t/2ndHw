package org.example;

public class Student extends Person{
    String courseName;
    public void printStudentInfo(){
        System.out.println("სახელი: " + name);
        System.out.println("ასაკი: " + age);
        System.out.println("კურსის სახელი: " + courseName);
    }
}
