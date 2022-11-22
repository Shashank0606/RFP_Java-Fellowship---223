package Day6PracticeProblems;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to chec perfect number test: ");
        int n = sc.nextInt();
        sc.close();
        int perfect = 0;
        for (int i = 1; i <= n / 2; i++) {

            int x = n / i;

            if (n % i == 0) {
                perfect = perfect + i;
            }
        }
        if (perfect == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }

    }

}