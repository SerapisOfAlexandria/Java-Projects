package Homework;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
