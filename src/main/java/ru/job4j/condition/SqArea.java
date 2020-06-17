package ru.job4j.condition;
import  java.lang.Math;


public class SqArea {
    @SuppressWarnings("checkstyle:ParenPad")
    public static double square(int p, int k) {
        //h = p / (2 * (k + 1));  L = h * k;  s = L * h; s = h*k*h
        double h = p / (2 * (k + 1));
        double rsl = Math.pow(h, 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}