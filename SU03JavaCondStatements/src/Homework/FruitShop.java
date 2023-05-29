package Homework;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.nextLine();
        String day = input.nextLine();
        double quantity = Double.parseDouble(input.nextLine());
        double price = 0;
        int check = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.5 * quantity;
                        break;
                    case "apple":
                        price = quantity * 1.2;
                        break;
                    case "orange":
                        price = .85 * quantity;
                        break;
                    case "grapefruit":
                        price = .45 * quantity;
                        break;
                    case "kiwi":
                        price = 2.7 * quantity;
                        break;
                    case "pineapple":
                        price = 5.5 * quantity;
                        break;
                    case "grapes":
                        price = 3.85 * quantity;
                        break;
                    default:
                        System.out.println("error");
                        check ++;
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.7 * quantity;
                        break;
                    case "apple":
                        price = 1.25 * quantity;
                        break;
                    case "orange":
                        price = 0.9 * quantity;
                        break;
                    case "grapefruit":
                        price = 1.6 * quantity;
                        break;
                    case "kiwi":
                        price = 3.00 * quantity;
                        break;
                    case "pineapple":
                        price = 5.6 * quantity;
                        break;
                    case "grapes":
                        price = 4.2 * quantity;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                check ++;
                break;
        }
        if (check != 1) {
            System.out.printf("%.2f", price);
        }
    }
}
