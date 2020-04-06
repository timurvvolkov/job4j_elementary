package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return temp >= third ? temp : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(first, second, third);
        return temp >= fourth ? temp : fourth;
    }
}
