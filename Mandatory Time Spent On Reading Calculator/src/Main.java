import java.util.Scanner;

public class Main {
    // This program calculates how many hours a day should be spent on studying
    public static void main(String[] args) {

        Scanner input_1 = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        Scanner input_3 = new Scanner(System.in);

        int amountOfPages = Integer.parseInt(input_1.nextLine());
        int pagesReadHourly = Integer.parseInt(input_2.nextLine());
        int readingDays = Integer.parseInt(input_3.nextLine());

        int hoursSpentDaily = (amountOfPages / pagesReadHourly) / readingDays;

        System.out.println(hoursSpentDaily);

    }
}