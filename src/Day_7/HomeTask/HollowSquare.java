package Day_7.HomeTask;
import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the stars in each side of square: ");
        int n = scanner.nextInt();

        System.out.println("Hollow Square Star Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star for boundaries
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
