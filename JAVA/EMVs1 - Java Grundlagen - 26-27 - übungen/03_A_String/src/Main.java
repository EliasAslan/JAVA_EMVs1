public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning Java output and getting to know Strings better" to the console.

        String aufgabe1 = "I am learning Java output and getting to know Strings better";
        IO.println(aufgabe1);


        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        String aufgabe2_1 = "String concatenation";
        String aufgabe2_2 = "works!";
        String result2 = aufgabe2_1 + " " + aufgabe2_2;
        IO.println(result2);


        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.

        String firstName = "elias";
        IO.println(firstName);

        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        //    (Obviously replace "..." with your first/last name).

        String lastName = "blondiau";
        System.out.println("My first name is " + firstName);
        System.out.println("And my last name is " + lastName);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school= "Berufsfachschule";      // Complete this line
        String location = "Oberwallis";           // Complete this line

        // Do not change the following lines
        String result = school + " " + location;
        System.out.println(result);

        // What is the purpose of " " ?
        //um strings mit anderen daten zu unterscheiden oder um ein leerzeichen einzufügen
        // Your answer here

        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "Java" and print "I am learning Java!" using the variable.
        String language = "java!";
        IO.println("i am learning" + " " + language);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:
		
        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.
        System.out.println("I am learning about");
        System.out.println("escape characters.");
        System.out.println("I need to look up");
        System.out.println("\"escape characters\"");
        System.out.println("to solve this task.");

        IO.println("different version ⬇️");
        // Your code here
        System.out.println("I am learning about\nescape characters.\nI need to look up\n\"escape characters\"\nto solve this task.");

    }
}