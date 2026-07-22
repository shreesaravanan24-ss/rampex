package Day_24;

import java.util.Scanner;

public class AstrologyLuckyNumber {

    // Method to reduce number to single digit
    public static int getSingleDigit(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    // Method to return lucky colour
    public static String getLuckyColour(int number) {
        switch (number) {
            case 1:
                return "Red";
            case 2:
                return "White";
            case 3:
                return "Yellow";
            case 4:
                return "Blue";
            case 5:
                return "Green";
            case 6:
                return "Pink";
            case 7:
                return "Violet";
            case 8:
                return "Black";
            case 9:
                return "Golden";
            default:
                return "No Colour";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine().toUpperCase();

        int total = 0;

        System.out.println("\nLetter Values:");

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {
                int value = ch - 'A' + 1;
                total += value;
                System.out.println(ch + " = " + value);
            }
        }

        System.out.println("\nTotal Value = " + total);

        int luckyNumber = getSingleDigit(total);

        System.out.println("Lucky Number = " + luckyNumber);
        System.out.println("Lucky Colour = " + getLuckyColour(luckyNumber));

        sc.close();
    }
}