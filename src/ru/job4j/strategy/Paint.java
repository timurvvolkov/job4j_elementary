package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint1 = new Paint();
        paint1.draw(new Square());
        Paint paint2 = new Paint();
        paint2.draw(new Triangle());
    }
}
