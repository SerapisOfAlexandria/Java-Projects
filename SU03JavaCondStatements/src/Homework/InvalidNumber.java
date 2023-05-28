package Homework;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        if (num >= 100 && num <= 200) {
        } else if (num == 0) {
        } else {
            System.out.println("invalid");
        }
    }
}
