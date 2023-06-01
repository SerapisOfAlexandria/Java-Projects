package Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        String operation = input.nextLine();
        String equalOrEven = "";

        switch(operation) {
            case "/":
                if (y == 0) {
                    System.out.printf("Cannot divide %d by zero", x);
                } else {
                    double quotient = x / (y + .1 - .1);
                    System.out.printf("%d / %d = %.2f", x, y, quotient);
                }
                break;
            case "+":
                int result = x + y;
                if (result % 2 == 0) {
                    equalOrEven = "even";
                } else {
                    equalOrEven = "odd";
                }
                System.out.printf("%d + %d = %d - %s", x, y, result, equalOrEven);
                break;
            case "-":
                result = x - y;
                if (result % 2 == 0) {
                    equalOrEven = "even";
                } else {
                    equalOrEven = "odd";
                }
                System.out.printf("%d - %d = %d - %s", x, y, result, equalOrEven);
                break;
            case "*":
                result = x * y;
                if (result % 2 == 0) {
                    equalOrEven = "even";
                } else {
                    equalOrEven = "odd";
                }
                System.out.printf("%d * %d = %d - %s", x, y, result, equalOrEven);
                break;
            case "%":
                if (y == 0) {
                    System.out.printf("Cannot divide %d by zero", x);
                } else {
                    result = x % y;
                    System.out.printf("%d %% %d = %d", x, y, result);
                }
                break;
        }
    }
}
