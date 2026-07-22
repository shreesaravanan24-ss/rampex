package Day_24.Class_Task;
import java.util.NoSuchElementException;
public class LinkedListImplementation4 {


    public static void main(String[] args) {



        linkedlist li = new linkedlist();





//        li.deleteAtPos(0);

        li.display();

    }






}







class linkedlist{

    Node head ;

    int size;

    public void insertAtbeginning(int val){



        Node newnode =new  Node(val);
        if(head ==null)
        {                // if linked list is empty
            head = newnode;
        }


        else{               // if not empty
            newnode .next =head;
            head =newnode;}
        size ++;


    }


    // display method



    //insertAtEnd



    public void insertAtEnd(int val){

        Node newnode= new Node(val);


        // Linked list is empty

        if(head==null){

            head = newnode;

        }
        else{


            Node temp =head;

            for(int i=0;i<size-1;i++){
                temp = temp.next;
            }
            temp.next =newnode;


            size++;
        }




    }





    //------------insert AtPos based on index value


    public void insertAtPos(int index, int value) throws NoSuchElementException{

        //check whether index is valid

        if(!(index>=0 && index<=size)){
            throw new NoSuchElementException(" index value is not valid");}

        // if (index ==0)
        Node newnode=new Node(value);

        if(index==0){

            insertAtbeginning(value);
        }

        else{
            //traverse to the
            Node temp =head;
            for(int i =0;i<index-1;i++)
            {
                temp =temp.next;

            }
            newnode.next =temp.next;
            temp.next = newnode;

        }
        size++;


    }

    // delete in Linked

    public  void deleteAtPos(int index){

        if(isEmpty()){ throw new IllegalStateException("Linked List is Empty");}


        // index ==0  first element
        // last element
        if (index ==0){

            head =head.next;
            size--;
        }

        else{
            Node temp = head;

            for(int i=0 ; i<index-1;i++){

                temp =temp.next;


            }

            temp.next=temp.next.next;



            size--;
        }
//delete -----------------------







    }




    public void display(){
        // need to print all the values

        Node temp = head;

        for(int i=0;i<size-1;i++){

            System.out.print(temp.val + " -> ");
            temp =temp.next;

        }





    }


    public boolean isEmpty(){

        return head ==null;
    }







//---------------node class here-------------------------

    class Node{

        int val;

        Node next;


        Node (int value){

            val= value;
        }

    }
}