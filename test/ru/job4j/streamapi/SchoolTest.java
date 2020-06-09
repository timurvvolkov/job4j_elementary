package ru.job4j.streamapi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenMoreThan70AndLessThan100() {
        List<Student> list = new ArrayList<>();
        Student ivanov = new Student("Ivanov", 20);
        Student petrov = new Student("Petrov", 90);
        Student sidorov = new Student("Sidorov", 70);
        Student kovalev = new Student("Kovalev", 60);
        Student kuznetsov = new Student("Kuznetsov", 50);
        Student borisov = new Student("Borisov", 40);
        list.add(ivanov);
        list.add(petrov);
        list.add(sidorov);
        list.add(kovalev);
        list.add(kuznetsov);
        list.add(borisov);
        List<Student> result = School.collect(list, student -> (student.getScore() >= 70 && student.getScore() <= 100));
        List<Student> expect = new ArrayList<>();
        expect.add(petrov);
        expect.add(sidorov);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMoreThan50AndLessThan70() {
        List<Student> list = new ArrayList<>();
        Student ivanov = new Student("Ivanov", 20);
        Student petrov = new Student("Petrov", 90);
        Student sidorov = new Student("Sidorov", 70);
        Student kovalev = new Student("Kovalev", 60);
        Student kuznetsov = new Student("Kuznetsov", 50);
        Student borisov = new Student("Borisov", 40);
        list.add(ivanov);
        list.add(petrov);
        list.add(sidorov);
        list.add(kovalev);
        list.add(kuznetsov);
        list.add(borisov);
        List<Student> result = School.collect(list, student -> (student.getScore() >= 50 && student.getScore() < 70));
        List<Student> expect = new ArrayList<>();
        expect.add(kovalev);
        expect.add(kuznetsov);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMoreThan0AndLessThan50() {
        List<Student> list = new ArrayList<>();
        Student ivanov = new Student("Ivanov", 20);
        Student petrov = new Student("Petrov", 90);
        Student sidorov = new Student("Sidorov", 70);
        Student kovalev = new Student("Kovalev", 60);
        Student kuznetsov = new Student("Kuznetsov", 50);
        Student borisov = new Student("Borisov", 40);
        list.add(ivanov);
        list.add(petrov);
        list.add(sidorov);
        list.add(kovalev);
        list.add(kuznetsov);
        list.add(borisov);
        List<Student> result = School.collect(list, student -> (student.getScore() > 0 && student.getScore() < 50));
        List<Student> expect = new ArrayList<>();
        expect.add(ivanov);
        expect.add(borisov);
        assertThat(result, is(expect));
    }
}
