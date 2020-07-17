package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("The bus leaves.");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("In bus are " + pass + "passengers.");
    }

    @Override
    public double fillUp(double fuel) {
        double price = 60.4;
        return fuel * price;
    }
}
