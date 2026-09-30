public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; //valid

        // int firstNumber; //valid

        // int tryThisNumber; //valid

        // int _myNumber; //specialcharacter

        // int int; //uses java keyword

        // int _number_; //specialcharacter

        // int i; // valid but not recommended

        // int number1; valid

        // int .product; //special character

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; //reco
        int speed; //reco
        int JustANUmber; // is ok but wierd uppercase structure
        int justAnotherNumber; // reco
        int _weather; // nor reco, cause of special character
        int _Id; //not reco, specialcharacter
        int $Money; //not reco cause of special character
        int moneyinthebankaccount; //ok but upper case first letterrecommended
        int aLotOfmoneyonbankAccount; // wierd, not reco
        int circumstanceEarthInKM; //ok
        int circumstanceEarth_KM; //reco

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000; // a new salary or buying someting can in- or decrease it

        final short myBirthyear = 2001; //you cant change birthyear

        final byte amountOfMonths = 12; // we wont be changing the calander soon

        final float gravityForce = 9.81f; //physics stay

        final byte amountOfMinutesPerHour = 60; //our time system wont be changing anytime

        final short amountOfSecondsPerHour = 3600; //same as above

        final float pi = 3.14159f; //pi will say the same

        short amountOfStudents = 167; //students can fail or join

        IO.println();

        //--------------------------------------------------------------------------------------------------------------
    }
}