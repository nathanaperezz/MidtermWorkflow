package org.example;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Press enter to roll a dice or -1 to quit: ");
            String input = scan.nextLine();

            if(input.equals("-1")) {
                break;
            }

            else {
                int roll = getRoll();
                System.out.println("You rolled a " + roll);
            }
        }
        System.out.println("Goodbye!");
    }


    static int getRoll(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}