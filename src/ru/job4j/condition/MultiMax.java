package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        result = second > first ? second : result;
        result = third > result ? third : result;
        return result;
    }
}
