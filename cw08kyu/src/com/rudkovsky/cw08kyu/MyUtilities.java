package com.rudkovsky.cw08kyu;

import java.util.Scanner;

public class MyUtilities {
    public static boolean isDigit(String s) {
        //return true or false
        System.out.println("form isDigit");
        return true;
    }

    public static void main(String[] args) {
        //Input digits
        boolean exit = true;
        int testVar = 555;
        
        Scanner scanner = new Scanner(System.in);
        while (exit) {
            System.out.println("Enter the digit: ");
            String digit = scanner.next();
            System.out.println("Is digit? - " + MyUtilities.isDigit(digit));

            // Answer about exit of the game
            System.out.println("Do you want to continue? Press Y/N");
            char answer = scanner.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                exit = false;
            }
        }
    }
}
