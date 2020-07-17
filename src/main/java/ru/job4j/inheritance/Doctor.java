package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int licenseNum;

    public int getLicenseNum() {
        return licenseNum;
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
