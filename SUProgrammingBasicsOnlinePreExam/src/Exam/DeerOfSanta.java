package Exam;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int daysAbsent = Integer.parseInt(input.nextLine());
        int leftFoodInKG = Integer.parseInt(input.nextLine());
        double foodForDeerOneInKG = Double.parseDouble(input.nextLine());
        double foodForDeerTwoInKG = Double.parseDouble(input.nextLine());
        double foodForDeerThreeInKG = Double.parseDouble(input.nextLine());

        double totalDeerFoodConsumption = (foodForDeerOneInKG + foodForDeerTwoInKG + foodForDeerThreeInKG) * daysAbsent;

        if (leftFoodInKG - totalDeerFoodConsumption < 0) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(leftFoodInKG - totalDeerFoodConsumption)));
        } else if (leftFoodInKG >= totalDeerFoodConsumption) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFoodInKG - totalDeerFoodConsumption));
        }

    }
}
