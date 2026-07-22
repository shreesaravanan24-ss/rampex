package Day_25.Home_Task;

public class PredictOutput {
    public static void main(String[] args) {

        int x = 4;
        int y = 7;

        int z = x++ * --y + ++x * y-- - x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}