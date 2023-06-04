package Homework;

import java.util.Scanner;

public class NumbersN1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
