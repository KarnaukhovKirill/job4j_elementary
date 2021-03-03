package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static byte numberOfDay(String name) {
        byte value = switch (name) {
            case "Monday", "Понедельник" -> (byte) 1;
            case "Tuesday", "Вторник" -> (byte) 2;
            case "Wednesday", "Среда" -> (byte) 3;
            case "Thursday", "Четверг" -> (byte) 4;
            case "Friday", "Пятница" -> (byte) 5;
            case "Saturday", "Суббота" -> (byte) 6;
            case "Sunday", "Воскресенье" -> (byte) 7;
            default -> (byte) -1;
        };
        return value;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Пятница"));
    }
}
