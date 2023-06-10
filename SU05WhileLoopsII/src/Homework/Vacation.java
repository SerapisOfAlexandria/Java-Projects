package Homework;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double neededMoney = Double.parseDouble(input.nextLine());
        double availableMoney = Double.parseDouble(input.nextLine());
        int fiveConsecutiveDaysSpending = 0;
        int totalDays = 0;

        while (availableMoney < neededMoney) {
            if (fiveConsecutiveDaysSpending == 5) {
                System.out.printf("You can't save the money.\n");
                System.out.println(totalDays);
                break;
            }

            String operation = input.nextLine();
            double amount = Double.parseDouble(input.nextLine());

            if (operation.equals("save")) {
                fiveConsecutiveDaysSpending = 0;
                availableMoney += amount;
                totalDays ++;
            } else if (operation.equals("spend")) {
                fiveConsecutiveDaysSpending++;
                totalDays ++;
                if (availableMoney - amount <= 0) {
                    availableMoney = 0;
                } else {
                    availableMoney -= amount;
                }
            }

        }
        if(availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
