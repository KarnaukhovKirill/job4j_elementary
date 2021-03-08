package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int backMoney = money - price;
        while (backMoney > 0) {
            for (int index = 0; index < coins.length; index++) {
                while (coins[index] <= backMoney) {
                    backMoney -= coins[index];
                    rsl[size] = coins[index];
                    size += 1;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
