package ru.job4j.loop;

import jdk.nashorn.internal.ir.WhileNode;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year;
        for (year = 0; year <= amount; year++) {
         amount = (amount + (amount * percent / 100) - salary);
        }
        return year;
    }
}