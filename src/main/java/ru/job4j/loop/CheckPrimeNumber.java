package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings({"checkstyle:InnerAssignment", "checkstyle:EmptyBlock"})
    public static boolean check(int number) {
        int k = 0;
        boolean prime = true;
        if  (number == 1) {
            prime = false;
        }
            for (int j = number - 1; j > 1; j--) {
                if (number % j == 0) {
                    prime = false;
                    break;
                }
            }
        return prime;
    }
}
