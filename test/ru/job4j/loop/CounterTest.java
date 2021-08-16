package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToEightThenTwenty() {
        int start = 2;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromSixteenToTwentyOneThenFiftyFour() {
        int start = 16;
        int finish = 21;
        int result = Counter.sumByEven(start, finish);
        int expected = 54;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinusSixToMinusOneThenMinusTwelve() {
        int start = -6;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        Assert.assertEquals(expected, result);
    }
}