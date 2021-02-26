package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c) {
        double p = (a + b +c)/2;

        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    public static void main (String[] args) {
        double result = TrgArea.area(2, 2, 2);
        String rsl = String.format("%.3f", result);
        System.out.println("Area (2,2,2) = " + rsl);
    }
}
