package Day_13.Home_Task;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {12, 18, 25, 20, 30, 40};

        System.out.println("Array 1 is: " + isSorted(arr1));
        System.out.println("Array 2 is: " + isSorted(arr2));
    }

    public static String isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return "Not Sorted";
            }
        }
        return "Sorted";
    }
}
