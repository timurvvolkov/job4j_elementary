package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int pass);

    double fillUp(double fuel);
}
