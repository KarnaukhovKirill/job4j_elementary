package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int y = 0; y < numbers.length; y++) {
            System.out.println(numbers[y].length);
        }
    }
}
