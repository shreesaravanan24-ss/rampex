package Day_7.HomeTask;

public class SumofDigits {
    public static void main(String [] args){
        int num = 543;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of the digits: " + sum);
    }
}
