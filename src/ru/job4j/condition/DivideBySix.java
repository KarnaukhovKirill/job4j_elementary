package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "Исходное число делиться на 6.";
            } else {
                rsl = "Исходное число делиться на 3, но не является чётным.";
            }
        } else {
            if (number % 2 == 0) {
                rsl = "Исходное число не делиться на 3, но является чётным.";
            } else  {
                rsl = "Исходное число не делиться на 3 и не является чётным.";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(9));
    }
}
