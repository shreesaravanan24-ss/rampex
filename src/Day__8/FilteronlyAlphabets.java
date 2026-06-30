package Day__8;

import Day_8.ClassTask.String;

import java.util.Scanner;

public class FilteronlyAlphabets {
        public static void main(Day_8.ClassTask.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your insta user name: ");
        String userName = sc.nextLine();
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') {
                System.out.println(userName.charAt(i));
            }
        }
    }
}
