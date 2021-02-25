package ru.job4j.converter;

public class Fit {
    public static double manWeight (short height) {
        double rsl = (height - 100)*1.15;
        return rsl;
    }

    public static double womanWeight (short height) {
        double rsl = (height - 110)*1.15;
        return rsl;
    }

    public static void main (String[] args) {
        short height = 177;
        double man = Fit.manWeight(height);
        String manResult = String.format("%.2f", man);
        double woman = Fit.womanWeight(height);
        String womanResult = String.format("%.2f", woman);
        System.out.println("Man " + height + " is " + manResult);
        System.out.println("Woman " + height + " is " + womanResult);
    }
}
