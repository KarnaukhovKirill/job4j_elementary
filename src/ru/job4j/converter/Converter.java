package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + outEuro + " euro. Test result : " + passedEuro);

        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are " + outDollar + " dollars. Test result : " + passedDollar);
    }
}
