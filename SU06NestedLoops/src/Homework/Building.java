package Homework;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int floors = Integer.parseInt(input.nextLine());
        int rooms = Integer.parseInt(input.nextLine());
        int checkedFloors = 0;

        for (int i = floors; i >= 1; i--) {
            for (int b = 0; b < rooms; b++) {

                if (i == floors) {
                    System.out.printf("L%d%d ", i, b);
                } else  if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, b);
                } else {
                    System.out.printf("A%d%d ", i, b);
                }
            }
            System.out.printf("\n");
        }
    }
}
