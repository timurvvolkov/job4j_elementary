package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            boolean firstEl = true;
            for (String el : value.split("/")) {
                if (firstEl) {
                    tmp.add(el);
                    firstEl = false;
                    start += el;
                } else {
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}