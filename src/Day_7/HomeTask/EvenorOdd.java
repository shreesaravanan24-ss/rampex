package Day_7.HomeTask;
//import java.util.Arrays;
public class EvenorOdd {
    public static void main(String [] args) {
        int[] arr = {12, 5, 8, 21, 14, 7};
        int evenCount = 0;
        int oddCount = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            i++;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
