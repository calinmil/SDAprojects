package ro.sda;

import java.util.Scanner;

public class PrimeleNPrime {

    public static void printFirstNPrimes(int n) {
        int primesFound = 0;
        int i = 2;
        while(primesFound<n) {
            int divisors = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisors++;
                }
            }
            if (divisors == 0 ) {
                System.out.println(" Numarul " + i + "  este prim ");
                primesFound++;
            }
            //System.out.println(" testing " + i);
            i++;
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("  Please Enter n:  ");
        int n = scanner.nextInt();

        System.out.println("Determining first " + n + "  primes");
        printFirstNPrimes(n);

    }
}
