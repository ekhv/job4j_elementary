package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return 1.15 * (height - 100);
    }

    public static double womanWeight(short height) {
        return 1.15 * (height - 110);
    }

    public static void main(String[] args) {
        short manHeight = 182;
        short womanHeight = 170;
        double manIdealWeight = Fit.manWeight(manHeight);
        double womanIdealWeight = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + manIdealWeight);
        System.out.println("Woman 170 is " + womanIdealWeight);
    }
}