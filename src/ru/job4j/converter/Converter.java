package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int inEuro = 140;
        int expectedEuro = 2;
        boolean passedEuro = expectedEuro == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passedEuro);

        int dollar = Converter.rubleToDollar(140);
        int inDollar = 140;
        int expectedDollar = 2;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + dollar + " dollars. Test result : " + passedDollar);
    }
}
