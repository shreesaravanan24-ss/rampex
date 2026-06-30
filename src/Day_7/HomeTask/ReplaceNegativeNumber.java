package Day_7.HomeTask;

public class ReplaceNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {4, -3, 12, -9, 0, -1};
        int i = 0;

        while (i < arr.length) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            i++;
        }
        System.out.print("Modified Array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
