package Homework;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int totalSum = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            char currentChar = text.charAt(i);

            switch(currentChar) {
                case 'a':
                    totalSum += 1;
                    break;
                case 'e':
                    totalSum += 2;
                    break;
                case 'i':
                    totalSum += 3;
                    break;
                case 'o':
                    totalSum += 4;
                    break;
                case 'u':
                    totalSum += 5;
                    break;
            }
        }
        System.out.println(totalSum);
    }
}
