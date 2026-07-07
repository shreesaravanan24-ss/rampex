package Day_13.Class_Task;
import java.util.Scanner;
public class isPangram {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Sentence: ");//The Quick Brown Fox Jumps Over The Lazy Dog
//        String s = sc.nextLine();
//        //String s = "Good";
//        int count = 0;
//        //String s = Pangram(R);
//        //int v = s.length();
//        for (init i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    count++;
//                }
//            }
//            System.out.println(s.charAt(i) + ":" + count);
//            count = 0;
        System.out.println(isPangram("The Quick Brown Fox Jumps Over The Lazy Dog"));
        }

    public static boolean isPangram(String s) {
        //change the string to lowercase
        //Check whether a-z exists in a same sentence
        //using .contains method
        s = s.toLowerCase();
        int letter = 'a';
//        String[] all = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i <= 25; i++) {
//            if(s.contains(all[i]) == false){
            if(s.contains(String.valueOf((char)letter++)) == false){
                return false;
            }
        }
        return true;
    }
}