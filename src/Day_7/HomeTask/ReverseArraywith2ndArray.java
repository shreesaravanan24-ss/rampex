package Day_7.HomeTask;

public class ReverseArraywith2ndArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length) {
            reversed[i] = arr[j];
            i++;
            j--;
        }
        System.out.print("Reversed Array: ");
        for (int num : reversed) System.out.print(num + " ");
    }
}