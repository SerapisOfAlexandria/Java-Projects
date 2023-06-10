package Homework;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int width = Integer.parseInt(input.nextLine());
        int length = Integer.parseInt(input.nextLine());
        int area= width * length;

        while (true) {
            if (area <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
                break;
            }
            String cakePieces = input.nextLine();
                if (cakePieces.equals("STOP")) {
                if (area > 0) {
                    System.out.printf("%d pieces are left.", area);
                    break;
                }
            } else {
                    area -= Integer.parseInt(cakePieces);
            }
        }
    }
}
