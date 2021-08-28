package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To0Then10() {
        int left = 10;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To9Then9() {
        int one = 1;
        int two = 2;
        int three = 9;
        int result = Max.max(one, two, three);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0To7To2To1Then7() {
        int one = 0;
        int two = 7;
        int three = 2;
        int four = 1;
        int result = Max.max(one, two, three, four);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}