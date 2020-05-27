package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (func.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > 100;
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains("bug");
            }
        };
        return filter(list, func);
    }

    public static void main(String[] args) {
        List<Attachment> list = new ArrayList<>();
        list.add(new Attachment("abc", 120));
        list.add(new Attachment("bug", 80));
        list.add(new Attachment("name", 90));
        list.add(new Attachment("bug", 110));
        System.out.println(filterSize(list));
        System.out.println(filterName(list));
    }
}
