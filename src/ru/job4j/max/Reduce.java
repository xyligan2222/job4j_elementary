package ru.job4j.max;

public class Reduce {
    private static int[] array1 = {1, 2, 3};

    public void to(int[] array) {
        array = array1;
    }

    public void print() {
        for (int index = 0; index < array1.length; index++) {
            System.out.println(array1[index]);
        }
    }

    public static void main(String[] args) {
        Reduce reduce = new Reduce();
        reduce.to(array1);
        reduce.print();
    }
}