package Day_9.Class_Task;
import java.util.Arrays;
//import java.lang.ArrayIndexOutOfBoundsException;
public class FindMissingNumbers {
    public static void main(String [] args){
        int n = 6;
        int [] arr ={2,3,4,5,6};
        int aSum = 0;
        int arSum = 0;
        for(int i=1; i<=n; i++){
            aSum = aSum+i;
            //arSum = arSum[i-1];
            //aSum = aSum +i;
            if(i>arr.length){continue;}
            arSum = arSum+arr[i-1];
        }
        /*for(int i=0; i<arr.length; i++){
            arSum = arSum+i;

        }*/
        System.out.println(arSum);
        System.out.println(aSum);

    }
}
