import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(10);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(10);
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int gnumber = 0;
        int gnumber1= 0;
        int gnumber2= 0;
        int gnumber3 = 0;

        while(gnumber != number || gnumber1 != number1 || gnumber2 != number2 || gnumber3 != number3 ){
            do{
            gnumber = Integer.parseInt(IO.readln("guess a number from 1-9: ").trim());
            }while (gnumber >= 10);
            do{
            gnumber1 = Integer.parseInt(IO.readln("another one: (1-9) ").trim());
            }while (gnumber1 >= 10);
            do{
            gnumber2 = Integer.parseInt(IO.readln("another one: (1-9) ").trim());
            }while (gnumber2 >= 10);
            do {
                gnumber3 = Integer.parseInt(IO.readln("another one: (1-9) ").trim());
            }while (gnumber3 >= 10);

            IO.println(gnumber + "" + gnumber1 + "" + gnumber2 + "" + gnumber3);

            // first number
            if (number == gnumber) {
                IO.print("✓");
            } else if (number == gnumber1 || number == gnumber2 || number == gnumber3) {
                IO.print("✇");
            } else {
                IO.print("x");
            }

            // second number
            if (number1 == gnumber1) {
                IO.print("✓");
            } else if (number1 == gnumber || number1 == gnumber2 || number1 == gnumber3) {
                IO.print("✇");
            } else {
                IO.print("x");
            }

            // third number
            if (number2 == gnumber2) {
                IO.print("✓");
            } else if (number2 == gnumber || number2 == gnumber1 || number2 == gnumber3) {
                IO.print("✇");
            } else {
                IO.print("x");
            }

            // fourth number
            if (number3 == gnumber3) {
                IO.print("✓");
            } else if (number3 == gnumber || number3 == gnumber1 || number3 == gnumber2) {
                IO.print("✇");
            } else {
                IO.print("x");
            }

            IO.println("");
        }

    }
}
