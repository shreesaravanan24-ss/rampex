package Day_13.Home_Task;

public class ReverseWords {
    public static void main(String[] args) {
        String input1 = "Java is awesome";
        String input2 = "Welcome to Chennai";

        System.out.println(reverseEachWord(input1));
        System.out.println(reverseEachWord(input2));
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
