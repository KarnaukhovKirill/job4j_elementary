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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int y = 0; y < board.length; y++) {
            if (board[y][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int d = 0; d < board.length; d++) {
            if (board[d][d] == 'X') {
                if (monoHorizontal(board, d) || monoVertical(board, d)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
