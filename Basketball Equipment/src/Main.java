import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner yearlyBill = new Scanner(System.in);

        int bill = Integer.parseInt(yearlyBill.nextLine());

        double sneakers = bill - (bill * .4);
        double outfit = sneakers - (sneakers * .2);
        double basketball = outfit * .25;
        double accessories = basketball * .2;

        double yearlyPrice = sneakers + outfit + basketball + accessories + bill;

        System.out.println(yearlyPrice);
    }
}