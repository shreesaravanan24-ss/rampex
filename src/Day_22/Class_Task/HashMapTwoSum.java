package Day_22.Class_Task;
//import java.util.HashMap;
//import java.awt.image.ImageProducer;
import java.util.*;
public class HashMapTwoSum {
    public static void main(String [] args){
        int [] arr = {2,5,7,11,15};
        int target = 9;
        int [] indices = twoSum(arr, target);
        System.out.println(Arrays.toString(indices));
    }
    public static int [] twoSum(int [] arr, int target){
//        Using hash ImageProducer
//        Create hashMap and add all the numbers
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            hm.put(arr[i],i);
        }
        System.out.println(hm);
        int cmp;
        for(int i=0; i<n; i++){
            cmp = target - arr[i];//Finding complement
            if(hm.containsKey(cmp) && i!=hm.get(cmp)){
                return new int[]{i, hm.get(cmp)};
            }
            hm.put(arr[i], i);
        }
        return new int[]{};
    }
}
