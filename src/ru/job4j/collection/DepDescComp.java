package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] array1 = o1.split("/");
        String[] array2 = o2.split("/");
        if (array1[0].compareTo(array2[0]) > 0) {
            return o2.compareTo(o1);
        } else {
            return o1.compareTo(o2);
        }
    }
}