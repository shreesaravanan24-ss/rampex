package Day_15.Class_Task;

public class MultiThreading {
    public static void main(String[] args) {
//        Chef c1 = new Chef();//new
//        Thread t1 = new Thread(c1);
//        c1.run();
//        c1.getState();
//       System.out.println(c1.getState());
//        c1.start();//Runnable
//        System.out.println(c1.getState());
        Waiter w1 = new Waiter();
        w1.start();
        try{w1.join();}catch(InterruptedException e){
            System.out.println("Interupted");
        }
//        try{c1.join();}catch(InterruptedException e){
//            System.out.println("Interupted");
//        }
        //Thread wait/blocked/time waitting
//        try {
//            Thread.sleep(50000);
//            System.out.println(Thread.currentThread().getState());
//        } catch (InterruptedException e) {
//            System.out.println("Interupted");
//        }
//        System.out.println("Printed after seconds");
        System.out.println("Payment Collected");
    }
}
class Chef extends Thread{
    public void run(){

//        try {
//            Thread.sleep(10000);
//            System.out.println(Thread.currentThread().getState());
//        }catch(InterruptedException e){
//            System.out.println("Interupted");
//        }
//        System.out.println("This is the new Thread method");
//        System.out.println("Food Served and Customer Eating");
//        System.out.println("Customer Eating wait for 10 Seconds");
        System.out.println("Preparing Food...wait for 5 seconds");
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Interupted");
        }
    }
}
class Waiter extends Thread{
    public void run(){
        Chef c1 = new Chef();
        try {
            c1.join();
        }catch(InterruptedException e){
            System.out.println("Interupted");
        }
//        System.out.println("Got the Food, Serving");
        System.out.println("Served...Customer Eating wait for 10 Seconds");
        try {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Interupted");
        }
    }
}