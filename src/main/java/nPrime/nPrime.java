package nPrime;

import java.util.Scanner;

public class nPrime {

    static int nPrimeNumber(int N) {
        throw new UnsupportedOperationException("Waiting to be implemented");
    }

    public static void main(String[] args) {

        int N = 0;
        // First Test
        System.out.println("User input : ");
        Scanner scan = new Scanner(System.in);
        N = Integer.parseInt(scan.nextLine());
        System.out.println(nPrimeNumber(N));

        // Second Test
        N = 1001;
        System.out.println(nPrimeNumber(N));


    }

}