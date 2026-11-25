public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9

        // Answer: It would run forever because the iterator is not incremented in the for-loop.
        // Fixed code:

        for (int iteratorEx1 = 0; iteratorEx1 < 10; iteratorEx1++) {
            System.out.println("i:" + iteratorEx1 + " ");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
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

        System.out.println("Exercise 02-01");
        // 02-01: 0 to 100
        for (int iteratorEx2 = 0; iteratorEx2 <= 100; iteratorEx2++) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-02");
        // 02-02: 42 to 100
        for (int iteratorEx2 = 42; iteratorEx2 <= 100; iteratorEx2++) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-03");
        // 02-03: 42 to 123
        for (int iteratorEx2 = 42; iteratorEx2 <= 123; iteratorEx2++) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-04");
        // 02-04: Even numbers (0, 2, 4, ...) from 0 to 10
        for (int iteratorEx2 = 0; iteratorEx2 <= 10; iteratorEx2 += 2) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-05");
        // 02-05: Odd numbers (1, 3, 5, ...) from 0 to 10
        for (int iteratorEx2 = 1; iteratorEx2 <= 10; iteratorEx2 += 2) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-06");
        //  02-06: -10 to 20
        for (int iteratorEx2 = -10; iteratorEx2 <= 20; iteratorEx2++) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-07");
        //  02-07: 35 to 0 (descending)
        for (int iteratorEx2 = 35; iteratorEx2 >= 0; iteratorEx2--) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-08");
        //  02-08: 15 to -20 (descending)
        for (int iteratorEx2 = 15; iteratorEx2 >= -20; iteratorEx2--) {
            System.out.println(iteratorEx2);
        }

        System.out.println("Exercise 02-09");
        //  02-09: Even numbers from 10 to -10 (descending)
        for (int iteratorEx2 = 10; iteratorEx2 >= -10; iteratorEx2 -= 2) {
            System.out.println(iteratorEx2);
        }


        System.out.println("Exercise 02-10");
        //  02-10: Odd numbers from 10 to -10 (descending)
        for (int iteratorEx2 = 9; iteratorEx2 >= -10; iteratorEx2 -= 2) {
            System.out.println(iteratorEx2);
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        // Your code here
        for (int i = 0; i <= 100; i++) {
            forSum_03 += i;
        }

        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        // Your code here
        for (int i = 0; i <= 100; i += 2) {
            forSum_04 += i;
        }

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        // Your code here
        for (int i = 1; i <= 100; i += 2) {
            forSum_05 += i;
        }

        System.out.println(forSum_05); // Should be 2500
    }
}