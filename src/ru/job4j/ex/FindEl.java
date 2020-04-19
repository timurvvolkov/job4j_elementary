package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("no element was founded");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three", "four", "five"};
        try {
            indexOf(value, "six");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
