package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerList {
    public static List<Integer> collect(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList());
    }
}
