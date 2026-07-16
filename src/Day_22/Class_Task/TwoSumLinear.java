package Day_22.Class_Task;
import java.util.Arrays;
public class TwoSumLinear {
    public static void main (String [] args){
        int [] arr = {2,5,7,11,15};
        int target = 10;
        int [] indices = twoSum(arr, target);
        System.out.println(Arrays.toString(indices));
    }
    public static int [] twoSum(int [] arr, int target){
        int n = arr.length;
        int [] result;
        int checks = 0;
//        Check all the combinations, sum == target
        for(int i=0; i<n-1; i++){
//            foreach element checking with other combinations
            for(int j=i+1; j<n; j++){
                checks++;
                System.out.println();
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        System.out.println(checks + " checks");
        return new int[]{};
    }
}
