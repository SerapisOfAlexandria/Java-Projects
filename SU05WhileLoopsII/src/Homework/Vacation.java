package Homework;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double neededMoney = Double.parseDouble(input.nextLine());
        double availableMoney = Double.parseDouble(input.nextLine());
        int consecutiveDaysSpending = 0;
        int days = 0;

        while (consecutiveDaysSpending != 5) {
            String operation = input.nextLine();
            Double sum = Double.parseDouble(input.nextLine());

            switch (operation) {
                case "save":
                    availableMoney += sum;
                    consecutiveDaysSpending = 0;
                    break;
                case "spend":
                    availableMoney -= sum;
                    if (availableMoney <= 0) {
                        availableMoney = 0;
                    }
                    consecutiveDaysSpending++;
                    break;
            }

            days++;

            if (consecutiveDaysSpending == 5) {
                System.out.printf("You can't saved the money.\n");
                System.out.printf("%d", days);
                break;
            } else if (availableMoney >= neededMoney) {
                System.out.printf("You save the money for %d days", days);
            }

        }
    }
}
