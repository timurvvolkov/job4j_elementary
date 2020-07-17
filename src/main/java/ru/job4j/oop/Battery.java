package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(40);
        Battery second = new Battery(60);
        System.out.println("Charge level before.");
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("Charge level after.");
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
