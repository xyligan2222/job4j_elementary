package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int size = (array.length - 1);
        int temp = array[0];
        array[0] = array[size];
        array[size] = temp;
        return array;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}