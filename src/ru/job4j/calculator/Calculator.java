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

    /**
     * Method main.
     * @param args - arguments
     */
    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}
