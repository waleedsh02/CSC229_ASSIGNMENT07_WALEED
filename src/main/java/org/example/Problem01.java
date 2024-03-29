
package org.example;


// @author WALEED SHAHID
// CSC 229

public class Problem01 {

    public static long getSumOfPrimes(int n) { // this method is used to calculate the addition of prime numbers (number n)
        long sum = 0; // initialisation of the variable sum to store the values
        for (int i = 2; i <= n; i++) { // loop through the given numbers
            if (Prime_Num(i)) { //  checking if the number is a prime num
                sum += i; // adding prime number number to sum
            }
        }
        return sum;
    }

    private static boolean Prime_Num(int x) { // this method tells to make sure that the number is prime
        if (x <= 1) return false; // 01 and 0 are not prime numbers
        for (int i = 2; i * i <= x; i++) { // Checking if the number is divisible
            if (x % i == 0) return false; // if the num is divisible by any number other than 1 and itself... not a prime number
        }
        return true;
    }
}
public static void main(String[] args) { // this method is used to test getSumOfPrimes method.
    int First_Number = 10; // just a testing number
    // Print the sum of prime numbers up to the testNumber
    System.out.println("Sum of prime numbers up to " + First_Number + " is: " + getSumOfPrimes(First_Number));
}
// the time complexity is  O sqrt(n) as n is the input number
// the space complexity is O(1) as using fixed amount of space for storage.