package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Ivanov", 20),
                new Student("Petrov", 90),
                new Student("Sidorov", 70)
        );
        System.out.println(
                list.stream()
                    .collect(
                        Collectors.toMap(
                                e -> e.getSurname(),
                                e -> e
                        )
                    )
        );
    }
}
