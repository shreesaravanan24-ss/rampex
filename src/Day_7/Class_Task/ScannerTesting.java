package Day_7.Class_Task;
import java.util.Scanner;
public class ScannerTesting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String name = sc.nextLine().strip();
        /*String f = name.substring(0);
        String l = name.substring.stripLeading();*/
        System.out.println(name + i);
    }
}
