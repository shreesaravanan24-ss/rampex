package Day_27;



import java.util.ArrayList;
public class GraphByAdjList2 {


    public static void main(String[] args) {



        // creating an graph object and printing all the adj list


        GraphDsL g1 = new GraphDsL(4);


        g1.addEdge(0,1);
        g1.addEdge(0,2);

        g1.addEdge(1,2);


        g1.display();


    }

}
class GraphDsL{

    int vertices ;


    ArrayList<ArrayList<Integer>>adj;  // this is list of list

    // constructor

    GraphDsL(int vertices){

        adj = new ArrayList<ArrayList<Integer>>();

        // add the vertices number of ArrayList to the adj


        ArrayList<Integer> v0 =new ArrayList<Integer>();
        ArrayList<Integer> v1 =new ArrayList<Integer>();
        ArrayList<Integer> v2 =new ArrayList<Integer>();
        ArrayList<Integer> v3 =new ArrayList<Integer>();
        ArrayList<Integer> v4 =new ArrayList<Integer>();


        adj.add(v0);
        adj.add(v1);
        adj.add(v2);
        adj.add(v3);
        adj.add(v4);

        System.out.println("Graph object created , adjacency list created");
    }


    // add edge


    public void addEdge(int list , int node){

        //pass arg which list you want to update & with the adjacent value

        adj.get(list).add(node);

    }


    void display(){

        int num =0;

        for(ArrayList<Integer> list : adj){


            System.out.println( num++ + "--> " +list);
        }
    }





}