package Homework;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne = Integer.parseInt(input.nextLine());
        int numberTwo = Integer.parseInt(input.nextLine());

        for (int i = numberOne; i <= numberTwo; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int b = 0; b < currentNum.length() ; b++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(b));
                if (b % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(" "+ i);
            }
        }
    }
}
