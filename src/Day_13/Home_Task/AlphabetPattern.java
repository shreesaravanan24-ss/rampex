package Day_13.Home_Task;

public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 6; // Rows from A to F
        for (int i = 0; i < rows; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
