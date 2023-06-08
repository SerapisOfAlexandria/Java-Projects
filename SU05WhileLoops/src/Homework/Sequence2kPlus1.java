package Homework;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int sequenceNumber = 1;

        while (sequenceNumber <= n) {
            System.out.println(sequenceNumber);
            sequenceNumber = sequenceNumber * 2 + 1;
        }
    }
}
