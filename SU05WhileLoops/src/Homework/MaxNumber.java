package Homework;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = Integer.MAX_VALUE;

        while (true) {
            String n = input.nextLine();
            if (n.equals("Stop")){
                break;
            } else {
                if (maxNumber > Integer.parseInt(n)) {
                    maxNumber = Integer.parseInt(n);
                }
            }
        }
        System.out.println(maxNumber);
    }
}
