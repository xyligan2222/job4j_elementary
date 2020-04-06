package ru.job4j.calculator;
/**
 * Package for calculate task.
 * @author Andrey Shirokov (xyligan2222@yandex.ru)
 * @version Idea 2019.3.4
 * @since 01.04.2020
 */

public class Calculator {
    /* арифметические операции внутри метода
    *деление, вычитание, умножение
    */

    public static void main(String[] args) {
        int six = 6, five = 5, four = 4, one = 1, two = 2;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
