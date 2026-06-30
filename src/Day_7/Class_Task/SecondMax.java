package Day_7.Class_Task;

public class SecondMax {
    public static void main(String [] args){
        /*int [] nums = {1,2,3,4,5};
        int Smax=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                Smax = max;
                max = nums[i];
            }
        }
        System.out.println(Smax+ " " + max);*/
        int [] nums = {1,2,3,5,4,3,2,1};
        int Smax=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                Smax = max;
                max = nums[i];
            }else if(nums[i] > Smax){
                Smax = nums[i];
            }
        }
        System.out.println(Smax+ " " + max);
    }
}
