package Homework;

import java.util.Scanner;

public class Numbers1NwithStep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= number; i += 3) {
            System.out.println(i);
        }
    }
}
