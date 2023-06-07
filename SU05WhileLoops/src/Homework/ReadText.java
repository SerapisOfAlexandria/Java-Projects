package Homework;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        while (!word.equals("Stop")) {
            System.out.println(word);
            word = input.nextLine();
        }
    }
}
