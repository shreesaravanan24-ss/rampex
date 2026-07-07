package Day_13.Home_Task;

public class PrintSubstrings {
    public static void main(String[] args) {
        System.out.println("--- Substrings of abc ---");
        printSubstrings("abc");

        System.out.println("\n--- Substrings of dog ---");
        printSubstrings("dog");
    }

    public static void printSubstrings(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
