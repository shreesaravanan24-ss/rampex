package Day_22.Class_Task;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        bubbleSort(arr);
//        System.out.print(bubbleSort(arr));
    }
    public static void bubbleSort(int [] arr) {
//    public static int [] bubbleSort(int [] arr){
//        how many comparisons, how many
        int n = arr.length;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count++;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
//        Inner Loop compares itself to the next element
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-1; j++){
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(" ");
//    }
//}