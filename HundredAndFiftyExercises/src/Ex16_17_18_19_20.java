import java.util.Scanner;

public class Ex16_17_18_19_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ex 16
//        System.out.printf(" +\"\"\"\"\"+\n[| o o |]\n |  ^  | \n | '-' |\n +-----+");

        //Ex 17
        String binaryX = input.nextLine();
        String binaryY = input.nextLine();
        int length = 0;
        String sum = "";
        int carryOne = 0;

        if (binaryX.length() <= binaryY.length()) {
            length = binaryY.length();
        } else {
            length = binaryX.length();
        }
        for (int i = 1; i <= length - 1; i++) {
            if (Integer.parseInt(Character.toString(binaryX.charAt(i))) + Integer.parseInt(Character.toString(binaryY.charAt(i)) + carryOne) == 3) {
                carryOne = 1;
                sum = "1" + sum;
            } else if (Integer.parseInt(Character.toString(binaryX.charAt(i))) + Integer.parseInt(Character.toString(binaryY.charAt(i)) + carryOne) == 2) {
                carryOne = 1;
                sum = "0" + sum;
            } else if (Integer.parseInt(Character.toString(binaryX.charAt(i))) + Integer.parseInt(Character.toString(binaryY.charAt(i)) + carryOne) == 1) {
                carryOne = 0;
                sum = "1" + sum;
            } else {
                carryOne = 0;
                sum = "0" + sum;
            }
        }
        System.out.println(sum);

    }
}
