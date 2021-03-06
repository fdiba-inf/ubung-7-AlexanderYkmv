package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        if (n == 0) {
            return;
        }
        if (isPrime(n)) {
            System.out.println(n);
        }
        printPrimes(n - 1);
    }

    public static boolean isPrime(int n) {
       int div = 2;
       while (div < n) {
           if (n % div == 0) {
               return false;
           }
           div++;
       }
       return true;
    }
}
