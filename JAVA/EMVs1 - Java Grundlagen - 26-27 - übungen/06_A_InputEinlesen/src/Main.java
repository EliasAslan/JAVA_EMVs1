import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!


        IO.println("What is your first name?");
        String firstName = IO.readln();

        IO.println("What is your last name?");
        String lastName = IO.readln();

        IO.println("How old are you?");
        String age = IO.readln();

        IO.println("What day were you born?");
        String day = IO.readln();

        IO.println("What month were you born?");
        String month = IO.readln();

        IO.println("What year were you born?");
        String year = IO.readln();

        IO.println("Are you a student? (true/false)");
        String student = IO.readln();

        IO.println("What is your favorite food?");
        String food = IO.readln();

        IO.println("What is your favorite color?");
        String color = IO.readln();

        IO.println("What is your favorite hobby?");
        String hobby = IO.readln();

        IO.println("Thank you for your input, " + firstName + " " + lastName + "!");
        IO.println("You are " + age + " years old.");
        IO.println("You were born on " + day + "." + month + "." + year);
        IO.println("Are you a student? " + student);
        IO.println("Your favorite food is: " + food);
        IO.println("Your favorite color is: " + color);
        IO.println("Your favorite hobby is: " + hobby);

        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication

        Scanner userinput = new Scanner(System.in);

        System.out.println("What is 5 + 5?");
        String fuf = userinput.nextLine();

        System.out.println("You said: " + fuf);
        System.out.println("The answer is 10");


        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        IO.println("How heavy are you? (kg)");
        double weight = Double.parseDouble(IO.readln());
        IO.println("And how tall are you? (m)");
        double height = Double.parseDouble(IO.readln());
        double bmi = weight / (height * height);
        IO.println("Your BMI is: " + bmi);
        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min

        IO.println("type a number of minutes\n");
        int minutes = Integer.parseInt(IO.readln());
        int hours = minutes / 60;
        int min = minutes % 60;
        IO.println("that is about:" + hours+ "h and " + min + "m");
        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).

        IO.println("put in a random amout of a radius in cm, just the number\n");
        float radius = Float.parseFloat(IO.readln());
        float pi = 3.1415927F;
        float  circumference = 2 * pi * radius;
        float area = pi * (radius * radius);
        IO.println("the circumfrence is about: " + circumference);
        IO.println("the Area is about: " + area);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        IO.println("put in a random amount of a bill and a random amout of a tip, but the tip has to be in precentage. (o.2 = 20% | o.4 = 40% | 0.03 = 3%)");
        IO.println("Bill: ");
        float bill = Float.parseFloat(IO.readln());
        IO.println("tip: ");
        float tip = Float.parseFloat(IO.readln());
        float tipCalc = bill * tip;
        float total = bill + tipCalc;
        IO.println("hello good sir, the total amout would be about: " + total);
        IO.println("hope it was to your taste");



        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        IO.println("whats your hourly wage? ");
        byte wageH = Byte.parseByte(IO.readln());
        IO.println("how many hours a week do you work? ");
        byte hoursW = Byte.parseByte(IO.readln());
        int wageM = (wageH * hoursW) * 4;
        int wageY = (wageH * hoursW) * 52;
        IO.println("Your monthly wage is: " + wageM);
        IO.println("Your Yearly salary is: " + wageY);



        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!


        IO.println("Welcome to the Professional Procrastination Quiz!");
        IO.println("Let's find out if you are a true master of avoiding work!");

        byte points = 0;

        IO.println("Q01: You have homework due tomorrow. What do you do first?");
        IO.readln();
        IO.println("Correct answer: Literally anything except the homework.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());


        IO.println("Q02: How many YouTube videos can be watched before starting a 10-minute task?");
        IO.readln();
        IO.println("Correct answer: One more than planned.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q03: What is the best time to start studying for an exam?");
        IO.readln();
        IO.println("Correct answer: Five minutes before the exam.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());


        IO.println("Q04: What should you clean when you don't want to work?");
        IO.readln();
        IO.println("Correct answer: Your entire room.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q05: A task takes 15 minutes. How long do you think about doing it?");
        IO.readln();
        IO.println("Correct answer: Three days.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q06: What is the natural enemy of productivity?");
        IO.readln();
        IO.println("Correct answer: Your phone.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q07: You open your laptop to study. What appears first?");
        IO.readln();
        IO.println("Correct answer: Social media.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q08: How many snack breaks are acceptable during one hour of work?");
        IO.readln();
        IO.println("Correct answer: At least four.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Q09: What's the most common sentence before doing absolutely nothing?");
        IO.readln();
        IO.println("Correct answer: 'Just five more minutes.'");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());


        IO.println("Q10: Last question! When should you take this quiz again?");
        IO.readln();
        IO.println("Correct answer: Instead of doing something important.");
        IO.println("If your answer was correct, enter 1, otherwise 0.");
        points += Byte.parseByte(IO.readln());

        IO.println("Calculating results...");
        IO.println("You scored " + points + " out of 10!");

        IO.println("0-3 points: You actually get things done.");
        IO.println("4-7 points: Average procrastinator.");
        IO.println("8-10 points: Congratulations! You are a certified procrastination expert!");
        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);