package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float expectedResultEUR = 2;
        boolean passedResultEUR = expectedResultEUR == Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2 EUR. Test result : " + passedResultEUR);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float expectedResultUSD = 2.3333333f;
        boolean passedResultUSD = expectedResultUSD == Converter.rubleToDollar(140);
        System.out.println("140 rubles are 2.3333333 USD. Test result : " + passedResultUSD);
    }
}