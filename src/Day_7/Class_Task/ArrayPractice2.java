package Day_7.Class_Task;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String [] args){
        int [] arr = new int[5];
        for (int i=0; i < 5; i=i+2){
            arr[i] = (2*i)-1;
            //i=i+2 a[i] = (2*i)-1 == [-1,0,3,0,7]
            //i++ a[i] = (2*i)-1 == [-1,1,3,5,7]
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
