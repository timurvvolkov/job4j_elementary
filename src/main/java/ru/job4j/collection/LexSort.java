package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        left = left.substring(0, left.indexOf("."));
        right = right.substring(0, right.indexOf("."));
        int leftN = Integer.parseInt(left);
        int rightN = Integer.parseInt(right);
        return Integer.compare(leftN, rightN);
    }
}
