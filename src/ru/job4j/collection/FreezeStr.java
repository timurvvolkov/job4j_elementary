package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        List<String> lList = new ArrayList<String>();
        List<String> rList = new ArrayList<String>();
        Collections.addAll(lList, left.split(""));
        Collections.addAll(rList, right.split(""));
        for (String s : lList) {
            int index = rList.indexOf(s);
            if (index != -1) {
                rList.set(index, null);
            } else {
                return false;
            }
        }
        return true;
    }
}