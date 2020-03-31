package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings({"checkstyle:InnerAssignment", "checkstyle:EmptyBlock"})
    public static boolean check(int number) {
        boolean prime = true;
        while (prime) {
            if ((number % 2 == 0) || (number == 1)) {
            prime = false;
        } else  {
            break;
        }
        }
        return prime;
    }
}