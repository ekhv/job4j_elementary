package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int num;
        int sum = 0;
        for (num = start; num <= finish; num++) {
            sum = sum + num;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int num;
        int sum = 0;
        for (num = start; num <= finish; num++) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 20));
        System.out.println(sum(-1, 3));
        System.out.println(sum(-3, -1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}