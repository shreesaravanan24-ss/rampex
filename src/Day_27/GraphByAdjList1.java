package Day_27;
import java.util.ArrayList;
public class GraphByAdjList1 {


}
class graphDsL{

    int vertices ;


    ArrayList<ArrayList<Integer>>adj;  // this is list of list

    // constructor

    graphDsL(int vertices){

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



}