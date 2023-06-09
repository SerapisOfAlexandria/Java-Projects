package Homework;

import java.util.Scanner;

public class TheOldLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String desiredBook = input.nextLine();
        String book = "";
        int count = 0;


        while (book != desiredBook) {
            book = input.nextLine();
            if (book.equals(desiredBook)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            } else if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here!\n");
                System.out.printf("You checked %d books.", count);
                break;
            } else {
                count++;
            }
        }

    }
}
