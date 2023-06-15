package Homework;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNumber = Integer.toString(i);
            int positionOne = Integer.parseInt(currentNumber.charAt(0) + "");
            int positionTwo = Integer.parseInt(currentNumber.charAt(1) + "");
            int positionThree = Integer.parseInt(currentNumber.charAt(2) + "");
            int positionFour = Integer.parseInt(currentNumber.charAt(3) + "");
            if (positionOne != 0 && positionTwo != 0 && positionThree != 0 && positionFour != 0) {
                if (number % positionOne == 0 ) {
                    if (number % positionTwo == 0) {
                        if (number % positionThree == 0) {
                            if (number % positionFour == 0) {
                                System.out.printf("%d ", i);
                            }
                        }
                    }
                }
            } else {
                continue;
            }

        }
    }
}
