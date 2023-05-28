import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner width = new Scanner(System.in);
        Scanner length = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        Scanner spaceForNotWater = new Scanner(System.in);

        int aBase = Integer.parseInt(width.nextLine());
        int bBase = Integer.parseInt(length.nextLine());
        int cHeight = Integer.parseInt(height.nextLine());
        double percentage = Double.parseDouble(spaceForNotWater.nextLine());

        double waterVolume = (aBase * bBase * cHeight) * .001;

        double neededWater = waterVolume * (1 - percentage/100);

        System.out.println(neededWater);

    }
}