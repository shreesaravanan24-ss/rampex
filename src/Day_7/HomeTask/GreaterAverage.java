package Day_7.HomeTask;

public class GreaterAverage {
    public static void main(String [] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int i = 0;

// Step 1: Calculate sum
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        double average = (double) sum / arr.length;

// Step 2: Count elements greater than average
        int count = 0;
        i = 0; // Reset index pointer
        while (i < arr.length) {
            if (arr[i] > average) {
                count++;
            }
            i++;
        }

        System.out.println("Elements greater than average (" + average + "): " + count);
    }
}
