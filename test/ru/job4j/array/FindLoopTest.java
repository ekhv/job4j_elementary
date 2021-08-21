package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8ThenMinus1() {
        int[] data = {1, 7, 3, 6};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas0Then0() {
        int[] data = {0, 6, 7, 1};
        int el = 0;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind2() {
        int[] data = new int[] {8, 2, 10, 45};
        int el = 10;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFindMinus1() {
        int[] data = new int[] {3, 4, 0, 5, 6, 2, 1};
        int el = 7;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}