package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to20() {
        double expected = 2.24;
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20() {
        double expected = 1.42;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to21() {
        double expected = 1.42;
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11() {
        double expected = 1.42;
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1,1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when221to000() {
        double expected = 3;
        Point a = new Point(2, 2, 1);
        Point b = new Point(0, 0,0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}