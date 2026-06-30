package Day__8;

import Day_8.ClassTask.String;

import java.util.Scanner;
public class Example {
    public static void main(Day_8.ClassTask.String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) =='a' || name.charAt(i) =='e' ||name.charAt(i) =='i' ||name.charAt(i) =='o' ||name.charAt(i) =='u'){
                count = count+1;
            }
        }
    }
}
