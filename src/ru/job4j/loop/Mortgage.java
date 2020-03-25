package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double sumToPay = amount + amount * percent / 100;
        while (sumToPay > salary) {
            year++;
            sumToPay = (sumToPay - salary) * (1 + percent / 100);
        }
        return year;
    }
}
