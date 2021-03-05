package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Mark Tsukerberg";
        names[1] = "Nik Baskov";
        names[2] = "Pavel Durov";
        names[3] = "Andrei Rublev";
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }
    }
}
