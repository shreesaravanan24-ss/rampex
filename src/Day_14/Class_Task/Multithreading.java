package Day_14.Class_Task;

public class Multithreading {
    public static void main(String [] args){
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        System.out.println(t.getPriority());
//        MyThread t1 = new MyThread();
//        t1.start();
//        for(int i=0; i<100; i++){
//            System.out.println("Main Thread Working: " + (char)i);
//        }
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(new worker());
        t2.setName("Shree");
//        mt.printNum();
        System.out.println(t1.getName());
//        t1.getPriority();
        t1.start();
        for(int i=0; i<100; i++){
            System.out.println("Main Thread Working: " + (char)i);
        }
    }
}
//class worker{
//
//}
class MyThread extends Thread{//by Extending the Thread class
//    void run(){
//        System.out.println("New Thread");
//    }
//    public void printNum(){
    @Override
    public void run(){
        for(int i=0; i<100; i++){
//            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class worker extends Thread{
    public void run(){
        greet();
    }
    public static void greet(){
        System.out.println("Good Evening" + Thread.currentThread().getName());
    }
}