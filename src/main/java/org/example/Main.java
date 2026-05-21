package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.name = "უშანგი";
        Student1.age = 22;
        Student1.courseName = "web/api automation";

        System.out.println("სტუდენტის სახელია: " + Student1.name + ", მისი ასაკია: " + Student1.age +
                " და ის სწავლობს შემდეგ კურსზე: " + Student1.courseName);
    }
}