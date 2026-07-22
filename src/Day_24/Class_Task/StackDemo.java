package Day_24.Class_Task;

public class StackDemo {
    public static void main(String [] args){
        StackA s1 = new StackA();
        s1.display();
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
//        s1.pop();
//        s1.isEmpty();
//        s1.size();
    }
}
class StackA {
    int[] st;
    int size;
    int tos;
    int init_cap = 5;
    int capacity;

    StackA() {
        st = new int[init_cap];
        size = 0;
        tos = -1;
        System.out.println("Stack Object ");
    }

    public void push(int val) {
        if (tos < capacity - 1) {
            tos++;
            st[tos] = val;
        } else {
            System.out.println("Stack is Full");
        }
//        if(tos < size-1){
//        if(size <= init_cap){
//        if(size > init_cap){
//        if(size >= init_cap){
//            System.out.println("Stack is Full");
//            return;
//        }
//        tos++;
//        st[tos] = val;
    }

    //    Push Method
//    public void push(int val){
//        tos++;
//        st[tos] = val;
//    }
//    pop method
    public int pop(){
        if(isEmpty() == true){
            System.out.println("Stack is Empty");
            return -1;
        }
        return st[tos--];
    }
//    Display
    public void display() {
        for (int i = 0; i < tos; i++) {
            System.out.println(st[i] + " ");
        }
    }
    public boolean isEmpty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }
}