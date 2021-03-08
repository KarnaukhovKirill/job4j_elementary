package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = (y + 1) * (x + 1);
            }
        }
        return table;
    }
}
