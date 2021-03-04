package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int count = 1;
        amount += amount * percent / 100;
        while (salary < amount) {
            amount += amount * percent / 100;
            amount = amount - salary;
            count += 1;
        }
        return count;
    }
}
