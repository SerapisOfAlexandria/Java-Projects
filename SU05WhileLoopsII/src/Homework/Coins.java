package Homework;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = Double.parseDouble(input.nextLine());
        double amount = Math.floor(sum * 100);
        int coins = 0;



        while (amount > 0) {
            if(amount >= 200) {
                amount -= 200;
                coins++;
            } else if (amount >= 100) {
                amount -= 100;
                coins++;
            } else if (amount >= 50) {
                amount -= 50;
                coins++;
            } else if (amount >= 20) {
                amount -= 20;
                coins++;
            } else if (amount >= 10) {
                amount -= 10;
                coins++;
            } else if (amount >= 5) {
                amount -= 5;
                coins++;
            } else if (amount >= 2) {
                amount -= 2;
                coins++;
            } else if (amount >= 1) {
                amount -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
