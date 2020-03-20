package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(double height) {
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(185);
        System.out.println("Man 185 is " + man);
        double woman = Fit.womanWeight(170);
        System.out.println("Woman 170 is " + woman);
    }
}
