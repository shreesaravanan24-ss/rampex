package Day_23.Class_Task;

public class LinkedListImplementation {
    public static void main(String [] args){
        Node n1=new Node(4);
        LinkedList li = new LinkedList();
        li.insertAtbeginning(1);
//        Node n1=new Node();
//        n1.val =5;
//        n1.next=null;
//        Node n2=new Node();
//        n2.val=10;
//        n1.next=n2;
//        Node n3 = new Node();
//        n2.next =n3;
//        System.out.println(n1.val);
    }
}
class Node{
    Node next;
    Node(int val){
//        val = value;
    }
}
class LinkedList{
    Node head;
    public void insertAtbeginning(int val){
        Node newnode = new Node(val);
        head = newnode;
    }
    public void insertAtend(int val){

    }
}