public class Main {
    static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        byte b = 33;
        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;
        //char c = b;
        char c = (char) b;


        short s0 = 10;
        int i0 = s0;
        long l0b= s0;
        float f0 = s0;
        double d0 = s0;

        IO.println(d);
        IO.println(d0);
        IO.println(c);


        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        long l1 = 1234567890L;
        int i1 = (int) l1;

        IO.println(i1);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        IO.println(myNumber);

        // Try to guess first what happens, then test it. | i guess its gonna give an error

        // System.out.println(myNumber);

        // Can you explain what is happening?
        // it writes the 33 and then adds a ten, so its 3310


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        int houseNumber = Integer.parseInt(houseNumberInString);
        System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // its possible that it wont work because there is a space or a letter in the string

    }
}