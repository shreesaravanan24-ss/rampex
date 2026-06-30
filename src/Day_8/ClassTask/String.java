package Day_8.ClassTask;

import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        java.lang.String name = sc.nextLine();
        /*char[] letters = {'d', 'h', 'a', 'n', 'y', 'a'};
        String name = "Dhanya";*/
        /*String name1 = new String("Dhanya");
        System.out.println(name.length());*/
        //System.out.println(letters[5]);
        //System.out.println(name.charAt(0));
        /*for(int i=0; i<letters.length; i++){
            System.out.println(letters[i]);
        }
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }*/
        int n = name.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}
