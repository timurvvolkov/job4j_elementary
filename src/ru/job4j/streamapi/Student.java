package ru.job4j.streamapi;

public class Student {
    private String surname;
    private int score;

    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    public String getSurname() {
        return surname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", score=" + score +
                '}';
    }
}
