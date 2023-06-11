package Homework;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String userInput = input.nextLine();

        while (!userInput.equals("End")) {

            double neededMoney = Double.parseDouble(input.nextLine());
            double savedMoney = 0;

            while (savedMoney < neededMoney) {
                double sum = Double.parseDouble(input.nextLine());
                savedMoney += sum;
            }
            System.out.println("Going to " + userInput + "!");

            userInput = input.nextLine();
        }
    }
}
