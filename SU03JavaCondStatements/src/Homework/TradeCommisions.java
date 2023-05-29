package Homework;

import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String town = input.nextLine();
        double sales = Double.parseDouble(input.nextLine());
        double commision = 0;
        int check = 0;

        if (town.equals("Sofia")) {
            if (sales >= 0 && sales <= 500){
                commision = sales * .05;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * .07;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * .08;
            } else if (sales > 10000) {
                commision = sales * .12;
            } else {
                System.out.println("error");
                check ++;
            }
        } else if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500){
                commision = sales * .045;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * .075;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * .10;
            } else if (sales > 10000) {
                commision = sales * .13;
            } else {
                System.out.println("error");
                check ++;
            }
        } else if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500){
                commision = sales * .055;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * .08;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * .12;
            } else if (sales > 10000) {
                commision = sales * .145;
            } else {
                System.out.println("error");
                check ++;
            }
        } else {
            System.out.println("error");
            check ++;
        }
        if (check != 1) {
            System.out.printf("%.2f", commision);
        }
    }
}
