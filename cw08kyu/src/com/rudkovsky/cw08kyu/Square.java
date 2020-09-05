package com.rudkovsky.cw08kyu;

import java.util.Scanner;

public class Square {
    public static String isSquare(int n) {
        if (n == 0) return true;

        for (int i = 1; i * i <= n; i++) {

            if ((n % i == 0) && (n / i == i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Input digits
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        while (exit) {
            System.out.println("Enter the digit: ");
            int digit = scanner.nextInt();
            System.out.println("Is digit square? - " + Square.isSquare(digit));

            // Answer about exit of the game
            System.out.println("Do you want to continue? Press Y/N");
            char answer = scanner.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                exit = false;
            }
        }
    }
}