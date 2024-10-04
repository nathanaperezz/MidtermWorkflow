package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while(true) {
            System.out.print("Press Enter to roll a dice or -1 to quit: ");
            String input = scan.nextLine();

            if(input.equals("-1")) {
                break;
            }

            else {
                int roll = random.nextInt(6) + 1;
                System.out.println("You rolled a " + roll);
            }
        }
        System.out.println("Goodbye!");
    }
}