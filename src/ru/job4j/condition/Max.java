package ru.job4j.condition;
/**
 * Максимум из двух/трех/четырех чисел
 * @author Shirokov Andrey
 */
public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }
    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }
}