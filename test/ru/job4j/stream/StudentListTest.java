package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentListTest {
    @Test
    public void collectingStudentList() {
        Student student1 = new Student("Ivanov", 20);
        Student student2 = new Student("Petrov", 90);
        Student student3 = new Student("Sidorov", 70);
        List<Student> list = Arrays.asList(student1, student2, student3);
        Map<String, Student> expect = new HashMap<>();
        expect.put(student1.getSurname(), student1);
        expect.put(student2.getSurname(), student2);
        expect.put(student3.getSurname(), student3);
        Map<String, Student> result = StudentList.collect(list);
        assertThat(result, is(expect));
    }
}
