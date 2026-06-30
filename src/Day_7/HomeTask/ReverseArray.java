package Day_7.HomeTask;

public class ReverseArray {
    public static void main(String [] args){
        int[] arr = {10, 20, 30, 40, 50};
        int lastElement = arr[arr.length - 1];

        int i = arr.length - 1;
        while (i > 0) {
            arr[i] = arr[i - 1];
            i--;
        }

        arr[0] = lastElement;

        System.out.print("Right Rotated 1x Array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
