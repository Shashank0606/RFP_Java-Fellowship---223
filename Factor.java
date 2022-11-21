package Day5Problems;

import java.util.Scanner;

public class Factor {

    void NumberFactor() {
        int count = 0;
        try (Scanner numbers = new Scanner(System.in)) {
            System.out.println("enter any integer:");
            int number = numbers.nextInt();

            int factor;
            for (factor = 1; factor <= number / 2; factor++) {
                if (number % factor == 0) {
                    System.out.println(factor + " is a factor to the " + number);
                    count = count + 1;
                }

                else {
                    System.out.println(number + " is a prime number");
                    break;
                }

            }
            System.out.println("number of factors of " + number + " is " + count);
        }

    }

    public static void main(String[] args) {
        new NumberFactors().numberFactor();
    }
}
