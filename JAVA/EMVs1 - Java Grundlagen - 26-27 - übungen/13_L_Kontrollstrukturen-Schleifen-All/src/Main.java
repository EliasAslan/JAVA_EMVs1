public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.

        // There are "better" solutions, but based on the knowledge we have so far, this is one possible solution.
        for (int i = 0; i < 2024; i++) {
            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    System.out.println("Year " + i + " is a leap year!");
                } else {
                    if (i % 400 == 0) {
                        System.out.println("Year " + i + " is a leap year!");
                    }
                }
            }
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 7; // change this value from prime to not prime to test
        // Your code here

        boolean isNPrime = true;
        for (int rest = 2; rest < n; rest++) {
            if (n % rest == 0) {
                isNPrime = false;
            }
        }

        if (isNPrime) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " is not a prime number!");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.

        isNPrime = true;
        for (int i = 2; i < 101; i++) {
            for (int rest = 2; rest < i; rest++) {
                if (i % rest == 0) {
                    isNPrime = false;
                }
            }
            if (isNPrime) {
                System.out.println("Prime number: " + i);
            }
            isNPrime = true;
        }
    }
}