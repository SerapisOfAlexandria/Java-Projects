import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Prices for different miscellaneous items
        double packOfPens = 5.80;
        double packOfMarkers = 7.20;
        double literOfBoardCleaningDetergent = 1.20;

        Scanner input_1 = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        Scanner input_3 = new Scanner(System.in);
        Scanner input_4 = new Scanner(System.in);

        int numberOfPOF = Integer.parseInt(input_1.nextLine());
        int numberOfPOM = Integer.parseInt(input_2.nextLine());
        int numberOfLitersOfBCD = Integer.parseInt(input_3.nextLine());
        double discount = Double.parseDouble(input_4.nextLine());

        double total = (numberOfPOF * packOfPens) + (numberOfPOM * packOfMarkers) + (numberOfLitersOfBCD * literOfBoardCleaningDetergent);
        double totalWithDiscount = total - (total * (discount / 100));
        System.out.println(totalWithDiscount);




    }
}