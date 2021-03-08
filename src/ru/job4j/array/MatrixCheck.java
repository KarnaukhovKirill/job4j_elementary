package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int y = 0; y < board[row].length; y++) {
            if (board[row][y] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
