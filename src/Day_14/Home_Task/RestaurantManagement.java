package Day_14.Home_Task;

class Chef extends Thread {
    public void run() {
        System.out.println(getName() + " : Making Noodles");
        System.out.println(getName() + " : Preparing Fried Rice");
    }
}

class Waiter extends Thread {
    public void run() {
        System.out.println(getName() + " : Serving Table 1");
        System.out.println(getName() + " : Serving Table 2");
    }
}

class Cashier extends Thread {
    public void run() {
        System.out.println(getName() + " : Generating Bill for Table 1");
        System.out.println(getName() + " : Collecting Payment");
        System.out.println(getName() + " : Printing Receipt");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Cashier cashier = new Cashier();

        chef.setName("Chef Thread");
        waiter.setName("Waiter Thread");
        cashier.setName("Cashier Thread");

        chef.start();
        waiter.start();
        cashier.start();
    }
}
/*class RestaurantWorker implements Runnable {
    private String workerRole;

    public RestaurantWorker(String workerRole) {
        this.workerRole = workerRole;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        try {
            if (workerRole.equalsIgnoreCase("Chef")) {
                System.out.println("[" + threadName + "] Starting shifts at the grill.");
                Thread.sleep(500); // Simulate task time
                System.out.println("[" + threadName + "] Making Noodles");
                Thread.sleep(500);
                System.out.println("[" + threadName + "] Food preparation complete.");

            } else if (workerRole.equalsIgnoreCase("Waiter")) {
                System.out.println("[" + threadName + "] Picking up plates from kitchen.");
                Thread.sleep(400);
                System.out.println("[" + threadName + "] Serving Table 1");
                Thread.sleep(400);
                System.out.println("[" + threadName + "] Serving Table 2");

            } else if (workerRole.equalsIgnoreCase("Cashier")) {
                System.out.println("[" + threadName + "] Accessing Point of Sale Register.");
                Thread.sleep(600);
                System.out.println("[" + threadName + "] Generating Bill for Table 1");
                Thread.sleep(300);
                System.out.println("[" + threadName + "] Collecting Payment");
                Thread.sleep(300);
                System.out.println("[" + threadName + "] Printing Receipt");
            }
        } catch (InterruptedException e) {
            System.out.println("[" + threadName + "] Interrupted during work.");
        }
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        // Create Thread instances passing distinct roles
        Thread chefThread = new Thread(new RestaurantWorker("Chef"));
        Thread waiterThread = new Thread(new RestaurantWorker("Waiter"));
        Thread cashierThread = new Thread(new RestaurantWorker("Cashier"));

        // Explicitly naming threads using setName()
        chefThread.setName("Chef Thread");
        waiterThread.setName("Waiter Thread");
        cashierThread.setName("Cashier Thread");

        // Fire off execution sequentially from main()
        chefThread.start();
        waiterThread.start();
        cashierThread.start();
    }
}*/