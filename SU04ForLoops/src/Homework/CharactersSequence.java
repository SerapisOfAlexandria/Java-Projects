package Homework;

import java.util.Scanner;

public class CharactersSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        for (int i = 0; i <= text.length() - 1; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
