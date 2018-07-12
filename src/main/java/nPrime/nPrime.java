package nPrime;

import java.util.Scanner;
import java.util.ArrayList;

public class nPrime {

    static int nPrimeNumber(int N) {
        int count = 1;
        int value = 2;

        boolean isPrime;

        ArrayList<Integer> primeList = new ArrayList<Integer>();

        while(true) {
            if(count == N)
                return value;

            primeList.add(value);

            do {
                isPrime = true;
                value++;
                for(Integer prime : primeList){
                    if((value % prime) == 0){
                        isPrime = false;
                        break;
                    }
                }
            } while (!isPrime);
            count++;
        }
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
