package Day_13.Class_Task;
import java.util.Scanner;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int a =0;
//        try {
//            /*int */a = sc.nextInt();
//            //System.out.println(a * a);
//        }catch(Exception e){
//            System.out.println("Error");
//        }
//        System.out.println(a * a); //if error program output as '0' as it is been already called as an int a=0;
//        System.out.println("Program Ended");
        System.out.println("Enter the Number: ");
//        int a = sc.nextInt();
        int a=0;
        try {
            //int a = sc.nextInt();
            a = sc.nextInt();
            System.out.println("Got the Input");

        }catch(InputMismatchException e){
                e.printStackTrace();
            }
            try {
                if (a > 10) {
                    throw new ArithmeticException();
                }
            }
//        catch (Exception e) {
//            System.out.println("Error");
//        }
//        catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println();
//        }
            catch (Exception e) {
                e.printStackTrace();
            }
        System.out.println(a);
        System.out.println("Program Ended Successfully");
    }
}
