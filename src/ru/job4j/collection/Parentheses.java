package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data[0] == ')' || data[data.length - 1] == '(') {
            return false;
        }
        int counter = 0;
        for (char ch : data) {
            if (ch == '(') {
                counter++;
            } else {
                counter--;
            }
        }
        return counter == 0 ? true : false;
    }
}
