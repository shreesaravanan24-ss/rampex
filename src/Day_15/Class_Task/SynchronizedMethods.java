package Day_15.Class_Task;

public class SynchronizedMethods {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 800;
        GPayAccount g1 = new GPayAccount(b1);
        PhonePe p1 = new PhonePe(b1);
        g1.pay();
        p1.pay();
        System.out.println(b1.balance);
    }
}
    class GPayAccount extends Thread{
        BankAccount b;
        GPayAccount(BankAccount bankAcc){
            System.out.println("GPay Account Created");
            this .b=bankAcc;
        }
        //This method will take 500 rs from your Account
        public void pay(){
//            b.balance = b.balance - 500;
            b.withdraw(500);
            System.out.println("GPay withdraw 500");
        }
    }
    class PhonePe extends Thread{
        BankAccount b;
        PhonePe(BankAccount bankAcc){
            System.out.println("PhonePe Account Created");
            this .b=bankAcc;
        }
        public void pay(){
//            b.balance = b.balance - 500;
            b.withdraw(300);
            System.out.println("PhonePe withdraw 300");
        }
    }
//    class BankAccount {
//        String name;
//        int balance;
//
//        //Withdraw Method
//        public void withdraw(int amount) {
//            balance = balance - amount;
//            System.out.println(amount);
//        }
//    }
    class BankAccount {
       String name;
       int balance;
    //Withdraw Method
    synchronized void withdraw(int amount) {
        balance = balance - amount;
        System.out.println(amount);
    }
}
