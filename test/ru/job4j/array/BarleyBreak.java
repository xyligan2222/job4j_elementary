package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] dbArray =  new int[3][3];
        int count = 0;
        for (int i = 0; i < dbArray.length; i++) {
            for (int j = 0; j < dbArray.length; j++) {
               dbArray[i][j] = dbArray[i][j] + 1 + count;
                count++;
                System.out.print(dbArray[i][j]);
            }
            System.out.println();
        }
    }
}
