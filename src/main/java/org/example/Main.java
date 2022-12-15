package org.example;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 10;
        int randomNumber = random.nextInt(b - a + 1) + a;
        int i;
        int tries = 0;
        final int maxTries = 3;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            i = input.nextInt();

            if (i > randomNumber)
                System.out.println("My number is less than " + i + ".");
            else if (i < randomNumber)
                System.out.println("My number is greater than " + i + ".");
            else
                System.out.println("Correct! " + randomNumber + " was my number! ");
        } while (i != randomNumber && ++tries <maxTries );

        if (tries == maxTries)
            System.out.println("You loose. The number was :" + randomNumber);
    }
}