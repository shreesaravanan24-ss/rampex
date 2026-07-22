package Day_24;

import java.util.Scanner;

public class AstrologyLuckyNumber2 {

    // Method to get numerology value of a letter
    public static int getLetterValue(char ch) {

        switch (ch) {

            case 'A': case 'J': case 'S':
                return 1;

            case 'B': case 'K': case 'T':
                return 2;

            case 'C': case 'L': case 'U':
                return 3;

            case 'D': case 'M': case 'V':
                return 4;

            case 'E': case 'N': case 'W':
                return 5;

            case 'F': case 'O': case 'X':
                return 6;

            case 'G': case 'P': case 'Y':
                return 7;

            case 'H': case 'Q': case 'Z':
                return 8;

            case 'I': case 'R':
                return 9;

            default:
                return 0;
        }
    }

    // Method to convert total into a single digit
    public static int getLuckyNumber(int total) {

        while (total > 9) {

            int sum = 0;

            while (total != 0) {
                sum = sum + (total % 10);
                total = total / 10;
            }

            total = sum;
        }

        return total;
    }

    // Method to display lucky colour
    public static String getLuckyColour(int number) {

        switch (number) {

            case 1:
                return "Red";

            case 2:
                return "White";

            case 3:
                return "Yellow";

            case 4:
                return "Green";

            case 5:
                return "Blue";

            case 6:
                return "Pink";

            case 7:
                return "Violet";

            case 8:
                return "Black";

            case 9:
                return "Golden";

            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     ASTROLOGY LUCKY NUMBER");
        System.out.println("====================================");

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine().toUpperCase();

        int total = 0;

        System.out.println("\nLetter Values");

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {

                int value = getLetterValue(ch);

                total = total + value;

                System.out.println(ch + " = " + value);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Total Value : " + total);

        int luckyNumber = getLuckyNumber(total);

        System.out.println("Lucky Number : " + luckyNumber);

        String colour = getLuckyColour(luckyNumber);

        System.out.println("Lucky Colour : " + colour);

        System.out.println("====================================");

        sc.close();
    }
}