package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            boolean temp = data[index];
            if (temp == data[index + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
