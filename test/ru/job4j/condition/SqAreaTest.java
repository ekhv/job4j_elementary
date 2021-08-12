package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K2() {
        double expected = 0.28;
        int p = 3;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K7() {
        double expected = 2.74;
        int p = 10;
        double k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3() {
        double expected = 1.18;
        int p = 5;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP13K18() {
        double expected = 2.11;
        int p = 13;
        double k = 18;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}