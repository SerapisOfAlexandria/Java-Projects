package Exam;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();
        boolean nothingFound = true;
        outer:
        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int number = a + b + c + d;
                        if ((number == a * b * c * d) && (n.charAt(n.length() - 1) == '5')) {
                            System.out.println(Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d));
                            nothingFound = false;
                            break outer;
                        } else if (((a * b * c * d) / number == 3) && Integer.parseInt(n) % 3 == 0) {
                            System.out.println(Integer.toString(d) + Integer.toString(c) + Integer.toString(b) + Integer.toString(a));
                            nothingFound = false;
                            break outer;
                        }
                    }
                }
            }
        }
        if (nothingFound) {
            System.out.println("Nothing found");
        }
    }
}
