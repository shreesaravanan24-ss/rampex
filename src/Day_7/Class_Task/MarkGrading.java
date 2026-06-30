package Day_7.Class_Task;
import java.util.Scanner;
import java.util.Arrays;
public class MarkGrading {
    public static void main(String [] args) {
        String [] subjects = new String [5];
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        for (int i = 0; i < subjects.length; i++) {
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Subject name: ");
            subjects[i] = sc.nextLine();
            //for (int j = 0; j < 1; j++) {
                System.out.println("Enter the marks: ");
                marks[i] = sc.nextInt();
            sc.nextLine();
            //}
        }

        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks+marks[i];
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + totalMarks/5);
        System.out.println("Congrats " + name + " , You have scored: " + totalMarks);
        System.out.print(Arrays.toString(marks));
        System.out.println(Arrays.toString(subjects));
    }
        //
    // System.out.print(Arrays.toString(marks));
    }
