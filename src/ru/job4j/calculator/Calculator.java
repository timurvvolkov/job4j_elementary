package ru.job4j.calculator;

/**
 * Calculator
 *
 * Класс для вычисления арифметических операций
 * @author Timur Volkov (timurvvolkov@gmail.com)
 */
public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    /**
     * Method main.
     * @param args - arguments
     */
    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(3, 4, 5));
    }
}
