package Homework;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);

        int firstNumber = Integer.parseInt(inputNum.nextLine());
        int secondNumber = Integer.parseInt(inputNum.nextLine());

        if (firstNumber < secondNumber) {
            System.out.println(secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(firstNumber);
        }

    }
}
