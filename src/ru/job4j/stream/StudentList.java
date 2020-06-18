package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    public static Map<String, Student> collect(List<Student> list) {
        return list.stream()
                .collect(
                        Collectors.toMap(
                                e -> e.getSurname(),
                                e -> e
                        )
                );
    }
}
