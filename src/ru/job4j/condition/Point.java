package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int differenceX = x2 - x1;
        int differenceY = y2 - y1;
        double exponentiationX = Math.pow(differenceX, 2);
        double exponentiationY = Math.pow(differenceY, 2);
        double sum = exponentiationX + exponentiationY;
        double rs1 = Math.sqrt(sum);
        return rs1;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 1, 3, 3);
        System.out.println("result (1, 1) to (3, 3) " + result2);
        double result3 = Point.distance(5, 2, 7, 5);
        System.out.println("result (5, 2) to (7, 5) " + result3);
    }
}
