package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean run = true;
        String player = "Первый";
        while (run) {
            System.out.print("На столе " + matches + " спичек. " + player + " игрок, возьмите от 1 до 3 спичек: ");
            int taken = Integer.valueOf(input.nextLine());
            if (taken <= 3 && taken >= 1) {
                matches -= taken;
                if (matches <= 0) {
                    System.out.println("На столе не осталось спичек. " + player + " игрок выиграл!");
                    run = false;
                }
                player = (player == "Первый") ? "Второй" : "Первый";
            }
        }
    }
}
