package Day_6.Class_Task;

public class SumOfTheArray {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5};
        //int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        //System.out.println(sum);
        /*int sum = 0;
        for(int i=0; i<5; i=i+2) {
            //if (i % 2 == 0) {
                sum = sum + arr[i];
                //System.out.println(sum);
            //}
        }
        System.out.println(sum);*/
        /*int product = 0;
        for(int i=0; i<5; i++) {
                product = product * arr[i];
                System.out.println(product);
        }
        //System.out.println(product);*/
        int sum = 0;
        for(int i=0; i<5; i=(2*i)-1) { //>0,2,4
            //if (i % 2 == 0) {
            sum = sum + arr[i];
            //System.out.println(sum);
            //}
        }
        System.out.println(sum);
    }
}
