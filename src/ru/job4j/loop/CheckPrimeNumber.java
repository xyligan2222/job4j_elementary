package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings({"checkstyle:InnerAssignment", "checkstyle:EmptyBlock"})
    public static boolean check(int number) {
        int k = 0;
        boolean prime = true;
        if  (number == 1) {
            prime = false;
        }
        while (prime) {
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    k += 1;
                }
            }
                if (k < 1) {
                    prime = true;
                } else {
                    prime = false;
                }

            break;

        }
            return prime;
        }
}
