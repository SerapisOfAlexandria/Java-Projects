import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner width = new Scanner(System.in);
        Scanner length = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        Scanner spaceForNotWater = new Scanner(System.in);

        int a = Integer.parseInt(width.nextLine());
        int b = Integer.parseInt(length.nextLine());
        int c = Integer.parseInt(height.nextLine());
        double percentage = Double.parseDouble(spaceForNotWater.nextLine());

        int waterVolume = (a * b) * c;

        double availableSpaceForWater = (waterVolume - (waterVolume * (percentage / 100))) / 1000;

        System.out.println(availableSpaceForWater);

    }
}