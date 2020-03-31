package ru.job4j.loop;

public class Board {
    @SuppressWarnings({"checkstyle:WhitespaceAround", "checkstyle:LeftCurly"})
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || ((i % 2 != 0 && j % 2 != 0))) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}