package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double sum = amount + amount * percent / 100;
        while (sum > salary) {
            year++;
            sum = (sum - salary) * (1 + percent / 100);
        }
        return year;
    }
}
