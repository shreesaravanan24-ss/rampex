package Day_25.Class_Task;

class Queue{

// creating a QUeue using array

    int arr[] ;

    int size;
    int front;
    int rear;

    Queue(){

        arr = new int[5];
        size =0;
        front =-1;
        rear =-1;
    }

// creating the methods for the queue

    public void enqueue(int val){

        if (rear==-1 && front ==-1){

            front++;
        }

        if(rear ==arr.length-1){
            System.out.println(" Queue is full");
            return;}

        rear++;
        arr[rear]=val;

        size++;


        display();

    }


// creating the dequeue method



    public int  dequeue(){
// when there is only one element left



        if ( front ==-1 &&rear ==-1){

            System.out.print(" cannot deque : empty queue");
            return -1;
        }
//taking the value from the front pointer
        int val = arr[front];

        if(front== rear){
            front =-1;
            rear =-1;
            return val;

        }
        front++;
        size--;

        return val;



    }


    public void display(){

        if (rear ==-1 && front ==-1){

            System.out.print(" [ ]");
            return;
        }


        for(int i=front;i<=rear;i++){

            System.out.print(arr[i]+"  ");

        }
        System.out.println();
    }
















    public static void main(String[] args) {

        Queue q = new Queue();


        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.enqueue(4);
        q.enqueue(5);

        System.out.println(" removed " + q.dequeue());
        System.out.println(" removed " + q.dequeue());
        System.out.println(" removed " + q.dequeue());
        System.out.println(" removed " + q.dequeue());
        System.out.println(" removed " + q.dequeue());
        System.out.println(" removed " + q.dequeue());



    }








}