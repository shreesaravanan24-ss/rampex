package Day_23.Class_Task;
import java.util.Arrays;
import java.util.ArrayList;
public class Lds {
    public static void main(String [] args){
        DynamicArray d = new DynamicArray();
        d.insert(5);
        d.insert(6);
        d.insert(7);
        d.insertAtPos(1, 55);
        d.insertAtPos(1, 60);
        System.out.println(d.get(2));
//        d.delete();
//        d.insert(9);
//        d.size();
        d.display();
        System.out.println(Arrays.toString(d.arr));
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        System.out.println(al);
    }
}
class DynamicArray {
    //    Need to create a resizable array
//    int [] arr = new int[5];
//    int pos = 0;
    int[] arr;
    int pos;
    int size;
    int init_size = 5;
    int capacity = init_size;
    DynamicArray() {
        arr = new int[capacity];
        pos = 0;
        size = 0;
    }
    public void display() {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
    public void insert(int val) {
        if(size > capacity){
            resize();
        }
        arr[pos] = val;
        pos++;//Insertion at position
        size++;//Moving the pointer
    }
//    To get the size
    public void size(int index){

    }
//    Delete
    public void delete(){
        pos--;
        size--;
    }
//    resize method
    public void resize(){
        if(size >= capacity/2){
            int temp [] = new int[2*capacity];
//            copying elements from old arr to new arr
            for(int i=0; i<arr.length; i++){
                temp[i]=arr[i];
            }
            arr = temp;
            capacity = capacity/2;
        }
    }
//    insertAtPosition
    public void insertAtPos(int index, int value){
//        insert at position
        for(int i=size+1; i>index; i--){
            arr[i] = arr[i-1];
        }
//        After shifting
        arr[index] = value;
        size++;
    }
//    Get method
    public int get(int index){
        return arr[index];
    }
//    isEmpty
    public void isEmpty(){
//        return size==0;
    }
}
