import java.util.Random;

        public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          iteratorEx1++;
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? -> it would infinitly loop the same thing.
        //      2. Why does this behavior occur? -> because the value is never changed so the case is always true, so it always does the commmand infinitly.
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9 -> By adding what i just did


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        IO.println("ex1");
        int ex1 = 0;
        while (ex1 <100){
            ex1++;
            System.out.print("ex1 = " + ex1 + " | ");
        }


        IO.println(" \n");
        IO.println("ex2");


        int ex2 = 42;
        while (ex2 <100){
            ex2++;
            System.out.print("ex2 = " + ex2 + " | ");
        }


        IO.println(" \n");
        IO.println("ex3");

        int ex3 = 42;
        while (ex3 <123){
            ex3++;
            System.out.print("ex3 = " + ex3 + " | ");
        }

        IO.println(" \n");
        IO.println("ex4");

        int ex4 = 0;
        while (ex4 <10){
            ex4 += 2;
            System.out.print("ex4 = " + ex4 + " | ");
        }

        IO.println(" \n");
        IO.println("ex5");

        int ex5 = 0;
        while (ex5 <10){
            ex5 += 2;
            System.out.print("ex5 = " + ex5 + " | ");
        }

        IO.println(" \n");
        IO.println("ex6");

        int ex6 = -10;
        while (ex6 < 20){
            ex6++;
            System.out.print("ex6 = " + ex6 + " | ");
        }

        IO.println(" \n");
        IO.println("ex7");

        int ex7 = 35;
        while (ex7 > 0){
            ex7 += -1;
            System.out.print("ex7 = " + ex7 + " | ");
        }

        IO.println(" \n");
        IO.println("ex8");

        int ex8 = 15;
        while (ex8 > -20){
            ex8 += -1;
            System.out.print("ex8 = " + ex8 + " | ");
        }


        IO.println(" \n");
        IO.println("ex9");

        int ex9 = 10;
        while (ex9 > -10){
            ex9 += -2;
            System.out.print("ex9 = " + ex9 + " | ");
        }


        IO.println(" \n");
        IO.println("ex10");

        int ex10 = 9;
        while (ex10 > -9){
            ex10 += -2;
            System.out.print("ex10 = " + ex10 + " | ");
        }
        IO.println(" \n");


        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;
        int sum = 0;
        while (whileSum_03 < 100){
            whileSum_03++;
            sum += whileSum_03;
            IO.print("sum" + "=" + sum + " | ");

        }

        System.out.println("\n " + whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;

        // Your code here

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;

        // Your code here

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;

        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}