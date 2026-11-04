public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        int weekDay = Integer.parseInt(IO.readln("pick a number between 1 and 7 "));

        IO.println("old: ");
        switch (weekDay) {
            case 1:
                IO.println("monday");
                break;
            case 2:
                IO.println("thuesday");
                break;
            case 3:
                IO.println("wednesday");
                break;
            case 4:
                IO.println("thursday");
                break;
            case 5:
                IO.println("friday");
                break;
            case 6:
                IO.println("saturday");
                break;
            case 7:
                IO.println("sunday");
                break;
            default:
                IO.println("Not a weekday!");
        }

        IO.println("new: ");
        switch (weekDay) {
            case 1 -> IO.println("monday");

            case 2 -> IO.println("thuesday");

            case 3 -> IO.println("wednesday");

            case 4 -> IO.println("thursday");

            case 5 -> IO.println("friday");

            case 6 -> IO.println("saturday");

            case 7 -> IO.println("sunday");

            default -> IO.println("Not a weekday!");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.


        String month = IO.readln("Write down your favorite month of the year:").toLowerCase();

        String season = switch (month) {
            case "december", "january", "february" -> "Winter";
            case "march", "april", "may" -> "Spring";
            case "june", "july", "august" -> "Summer";
            case "september", "october", "november" -> "Autumn";
            default -> "Not a month!";
        };

        IO.println(season);

        switch (month) {
            case "december":
            case "january":
            case "february":
                IO.println("Winter");
                break;

            case "march":
            case "april":
            case "may":
                IO.println("Spring");
                break;

            case "june":
            case "july":
            case "august":
                IO.println("Summer");
                break;

            case "september":
            case "october":
            case "november":
                IO.println("Autumn");
                break;

            default:
                IO.println("Not a month!");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        int monthDay = Integer.parseInt(IO.readln("type the number of a month "));

        switch (monthDay) {
            case 1 -> IO.println("31");
            case 2 -> IO.println("28");
            case 3 -> IO.println("31");
            case 4 -> IO.println("30");
            case 5 -> IO.println("31");
            case 6 -> IO.println("30");
            case 7 -> IO.println("31");
            case 8 -> IO.println("31");
            case 9 -> IO.println("30");
            case 10 -> IO.println("31");
            case 11 -> IO.println("30");
            case 12 -> IO.println("31");

        }


        switch (monthDay) {
            case 1:
                IO.println("31");
                break;
            case 2:
                IO.println("28");
                break;
            case 3:
                IO.println("31");
                break;
            case 4:
                IO.println("30");
                break;
            case 5:
                IO.println("31");
                break;
            case 6:
                IO.println("30");
                break;
            case 7:
                IO.println("31");
                break;
            case 8:
                IO.println("31");
                break;
            case 9:
                IO.println("30");
                break;
            case 10:
                IO.println("31");
                break;
            case 11:
                IO.println("30");
                break;
            case 12:
                IO.println("31");
                break;
            default:
                IO.println("Invalid month number");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

        int rpgCharacter = Integer.parseInt(IO.readln("pick a number from 1-8"));

        switch (rpgCharacter) {
            case 1, 5 -> IO.println("Mage (Strength: 3, Agility: 4, Intelligence: 9)");
            case 2, 6 -> IO.println("rogue (strength: 4 agility: 9 intelligence: 3");
            case 3, 7 -> IO.println("soldier (strength: 9 agility: 4 intelligence: 3");
            case 4, 8 -> IO.println("tank (stength: 9 agility: 3 intelligence: 4 ");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

        int numberTl = Integer.parseInt(
                IO.readln("Which digit do you want to translate? (1-9) ")
        );

        int language = Integer.parseInt(
                IO.readln("In which language? (1-German, 2-English, 3-Japanese) ")
        );

        String translation;

        if (language == 1) {
            translation = switch (numberTl) {
                case 1 -> "eins";
                case 2 -> "zwei";
                case 3 -> "drei";
                case 4 -> "vier";
                case 5 -> "fünf";
                case 6 -> "sechs";
                case 7 -> "sieben";
                case 8 -> "acht";
                case 9 -> "neun";
                default -> "keine Übersetzung möglich...";
            };
        } else if (language == 2) {
            translation = switch (numberTl) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "Translation not possible...";
            };
        } else if (language == 3) {
            translation = switch (numberTl) {
                case 1 -> "ichi";
                case 2 -> "ni";
                case 3 -> "san";
                case 4 -> "shi";
                case 5 -> "go";
                case 6 -> "roku";
                case 7 -> "nana";
                case 8 -> "hachi";
                case 9 -> "kyuu";
                default -> "Mukō na sūchi";
            };
        } else {
            translation = "Invalid language";
        }

        System.out.println(translation);



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}