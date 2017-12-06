package com.moohen;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i <50;i++) {
            if (isPrime(i)) {
                //count++ DOES every loop sends information to count, if a prime number appears in the loop
                count++;
                System.out.println("Number " + i + " is a prime number");
                // if statement DOES count to 3 and if finally it is 3 than it exiting for loop
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }


    private static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}
