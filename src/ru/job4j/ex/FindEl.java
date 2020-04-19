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

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (abuse.equals(value)) {
                throw new ElementAbuseException("abuse element detected");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] values = {"one", "two", "three", "four", "five"};
//        try {
//            indexOf(value, "six");
//        } catch (ElementNotFoundException e) {
//            e.printStackTrace();
//        }
        String[] abuses = {"six", "seven", "eight", "nine", "ten", "five"};
        try {
            process(values, "five", abuses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
