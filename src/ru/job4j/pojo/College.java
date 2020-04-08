package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Volkov");
        student.setName("Timur");
        student.setPatronymic("Vladimirovich");
        student.setGroup(2);
        student.setApply(new Date());
        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic()
                           + " is a student of " + student.getGroup() + " group. Applied " + student.getApply());
    }
}
