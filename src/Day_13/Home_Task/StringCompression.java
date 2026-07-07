package Day_13.Home_Task;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aaabbccccdd"));
        System.out.println(compress("xxxxxyzz"));
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // If next character is the same, increment counter
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append character and its count
                compressed.append(str.charAt(i)).append(count);
                count = 1; // Reset counter
            }
        }
        return compressed.toString();
    }
}