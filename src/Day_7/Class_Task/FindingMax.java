package Day_7.Class_Task;

public class FindingMax {
    public static void main(String [] args){

        int [] nums = {1,2,3,4,5};
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("Maximum value is "+ max);
        /*int [] nums = {1,2,3,4,5};
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println("Minimum value is "+ min);*/
    }
}
