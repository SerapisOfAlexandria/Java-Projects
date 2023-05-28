package Homework;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.parseInt(input.nextLine());

        if (num1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
