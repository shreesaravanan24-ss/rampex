package Day_11.Class_Task.OOP;
import java.util.SortedMap;
public class CarTask {
    public static void main(String [] args) {
        Car c1 = new Car("audi","m1");
        //Car c2 = new Car();
        //System.out.println(c2.brand);
        //c1.brand = c2.brand;
        //c2.brand = "bmw";
        //System.out.println(c1.brand);
    }

    static class Car {
        String brand;
        String model;
        /*public void start() {

            System.out.println("car started");
        }*/
        Car(){
            System.out.println("Construct a Car");
        }
        Car(String Cbrand, String Cmodel){
            //Assigned a brand name to the Object
            brand = Cbrand;
            model = Cmodel;
            System.out.println("Second Constructed a Car");
        }
    }
}
