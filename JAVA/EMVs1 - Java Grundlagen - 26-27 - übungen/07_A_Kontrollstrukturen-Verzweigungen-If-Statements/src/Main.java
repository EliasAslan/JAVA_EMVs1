import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int bigNumber = 5000;
        byte smallNumber = 1;
        if (bigNumber > smallNumber) {
            System.out.println("5000 is greater than 1!");
        } else {
            System.out.println("you defied the logic of this world!!");
        }

        boolean isBigger = bigNumber > smallNumber;
        if (isBigger) {
            System.out.println(bigNumber + " is greater than " + smallNumber + "!");
        } else {
            System.out.println("you defied the logic of this world!!");
        }

        System.out.println("Exercise 2");
        byte speedLimit = 120;
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("How fast are you driving?");
        int drivingSpeed = userInputScanner.nextInt();
        if (drivingSpeed > speedLimit) {
            System.out.println("stop!!!! your going to fast");
            System.out.println("calm down");
        }

        System.out.println("Exercise 3");
        int userYear = Integer.parseInt(IO.readln("type in the year you where born: "));
        if (userYear < 2000) {
            IO.println("thats ancient history!");
        } else {
            IO.println("i wish you a good future");
        }

        System.out.println("Exercise 4");
        System.out.println("How fast are you driving?");
        int drivingSpeed2 = userInputScanner.nextInt();
        if (drivingSpeed2 > speedLimit) {
            System.out.println("stop!!!! your going to fast");
            System.out.println("calm down");
        } else {
            System.out.println("continue as you are 👍");
        }

        System.out.println("Exercise 5");
        int userAge = Integer.parseInt(IO.readln("how old are you?"));
        if (userAge >= 21) {
            IO.println("You are legally allowed to consume alcohol.");
        } else {
            IO.println("You are not legally allowed to consume alcohol everywhere in the world.");
        }

        System.out.println("Exercise 6");
        int userAge2 = Integer.parseInt(IO.readln("how old are you?"));
        if (userAge2 >= 21) {
            IO.println("you are allowed to consume alcohol everywhere.");
        } else if (userAge >= 18) {
            IO.println("you are legally allowed to consume alcohol most parts of the world, except the United States");
        } else {
            IO.println("you are not legally allowed to consume alcohol in most parts of the world");
        }

        System.out.println("Exercise 7");
        int iq = Integer.parseInt(IO.readln("How high is your IQ? "));
        int ageUser = Integer.parseInt(IO.readln("How old are you? "));
        if (ageUser < 20) {
            IO.println("You are still young");
            if (iq >= 120) {
                IO.println("and you are quite smart");
            }
        } else if (iq >= 120) {
            IO.println("You are quite smart");
        } else {
            IO.println("You are not especially smart yet");
        }

        System.out.println("Exercise 8");
        int numberOne = Integer.parseInt(IO.readln("gimme an number"));
        int numberTwo = Integer.parseInt(IO.readln("gimme a second number"));
        if (numberOne > numberTwo) {
            IO.println("number 1: " + numberOne + "is bigger");
        } else if (numberTwo > numberOne) {
            IO.println("number 2: " + numberTwo + ", is bigger");
        } else {
            IO.println("the numbers are equal!");
        }

        System.out.println("Exercise 9");
        int grade = Integer.parseInt(IO.readln("What grade did you get? "));
        if (grade < 0) {
            IO.println("impossible");
        } else if (grade > 100) {
            IO.println("impossible");
        } else if (grade <= 30) {
            IO.println("failed");
        } else if (grade <= 50) {
            IO.println("poor");
        } else if (grade <= 60) {
            IO.println("ok");
        } else if (grade <= 80) {
            IO.println("good");
        } else if (grade <= 90) {
            IO.println("very good");
        } else {
            IO.println("awesome!");
        }

        System.out.println("Exercise 10");
        boolean isDoorOpen = true;
        if (isDoorOpen) {
            IO.println("Entering room...");
        } else {
            IO.println("Opening door...");
        }
        IO.println(isDoorOpen ? "Entering room..." : "Opening door...");

        System.out.println("Exercise 11");
        int age = Integer.parseInt(IO.readln("how old are you"));
        if (age == 18) {
            IO.println("thanks for coming, youll get a special discount");
        } else {
            IO.println("sadly because you are not 18 you wont get a discount");
        }

        if (age != 18) {
            IO.println("sadly because you are not 18 you wont get a discount");
        } else {
            IO.println("thanks for coming, youll get a special discount");
        }

        userInputScanner.close();
    }
}
