package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int group;
    private Date apply;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getApply() {
        return apply;
    }

    public void setApply(Date apply) {
        this.apply = apply;
    }
}
