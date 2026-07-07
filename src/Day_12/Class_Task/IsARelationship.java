package Day_12.Class_Task;

public class IsARelationship {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
//        v1.drive();
//        Car c1 = new Car();
//        c1.drive();
//        Vehicle b1 = new Baleno();
//        b1.drive();
//        Car b1 = new Baleno();
//        b1.drive();
//        Vehicle c1 = new Car();
//        c1.drive();
//        Car c1 = new Vehicle();// is impossible
//        c1.drive();
//        Car c2 = new Car();
//        Vehicle v2 = c2;
//        v2.drive();
//        Car c2 = new Car();
//        Vehicle v2 = c2;
//        v2.drive();//impossible without Vehicle print condition
//        Vehicle v2 = new Car();
        //v2.Start();
        //        new Car().
//        Vehicle v2 = new Vehicle();
//        v2.drive();
//        Vehicle v2 = new Car();// if drive not in Car then it checks Parent method and calls the parent drive print option
//        v2.drive();
        Car c1 = new Car();
        //c1.start();
        c1.brand ="bmw";
        c1.model= "s1";
        c1.engine= new Engine();
    }
}
//Two method same method but it calls the parent(class) method is a polymorphish is called run type polymorphism
class Vehicle {
    public void Start() {
        System.out.println("Car Started...");
    }

    //    public void drive(){
//        System.out.println("Vehicle driving...");
//    }
    public void drive() {
        System.out.println("Vehicle driving...");
    }
}

    class Car extends Vehicle {
        String brand;
        String model;
        Engine engine;
//    public void drive(){
//        System.out.println("Car driving...");
//    }
        //}
//class Baleno extends Car{
//    public void drive(){
//        System.out.println("Baleno driving...");
//
//    }
//}

//    String brand;
//    String model;
//    Engine engine;

        public void start() {
            engine.start(); //null.start();
        }
    }
        class Engine {
            public void start() {
                System.out.println("Engine Started");
            }
        }