package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void area() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(0, 3);
        Triangle tr = new Triangle(p1, p2, p3);
        double expected = 3.00;
        double out = tr.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void area2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 2);
        Point p3 = new Point(3, 4);
        Triangle tr = new Triangle(p1, p2, p3);
        double expected = 7.00;
        double out = tr.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void notExist() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);
        Triangle tr = new Triangle(p1, p2, p3);
        double expected = -1;
        double out = tr.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}