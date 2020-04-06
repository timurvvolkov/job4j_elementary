package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        double expected = 2.83;
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
