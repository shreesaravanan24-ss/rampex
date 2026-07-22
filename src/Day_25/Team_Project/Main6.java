package Day_25.Team_Project;

import java.util.ArrayList;
import java.util.Scanner;

// Entity Class
class Order {
    private int orderId;
    private String customerName;
    private String itemName;
    private int quantity;
    private double price;
    private String status;

    public Order(int orderId, String customerName, String itemName,
                 int quantity, double price, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalBill() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "------------------------------" +
                "\nOrder ID      : " + orderId +
                "\nCustomer Name : " + customerName +
                "\nItem Name     : " + itemName +
                "\nQuantity      : " + quantity +
                "\nPrice         : " + price +
                "\nTotal Bill    : " + getTotalBill() +
                "\nStatus        : " + status;
    }
}

// Manager Class
class RestaurantManager {

    ArrayList<Order> orders = new ArrayList<>();

    // Place Order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order Placed Successfully.");
    }

    // View All Orders
    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No Orders Available.");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }

    // Search by Customer or Status
    public void search(String key) {
        boolean found = false;

        for (Order o : orders) {
            if (o.getCustomerName().equalsIgnoreCase(key)
                    || o.getStatus().equalsIgnoreCase(key)) {

                System.out.println(o);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Matching Order Found.");
        }
    }

    // Update Quantity and Status
    public void updateOrder(int id, int quantity, String status) {

        for (Order o : orders) {

            if (o.getOrderId() == id) {

                o.setQuantity(quantity);
                o.setStatus(status);

                System.out.println("Order Updated Successfully.");
                return;
            }
        }

        System.out.println("Order ID Not Found.");
    }

    // Delete Cancelled Order
    public void deleteOrder(int id) {

        for (int i = 0; i < orders.size(); i++) {

            if (orders.get(i).getOrderId() == id) {

                orders.remove(i);
                System.out.println("Order Deleted Successfully.");
                return;
            }
        }

        System.out.println("Order ID Not Found.");
    }
}

// Main Class
public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RestaurantManager manager = new RestaurantManager();

        int choice;

        do {

            System.out.println("\n===== RESTAURANT ORDER & BILLING SYSTEM =====");
            System.out.println("1. Place Order");
            System.out.println("2. View All Orders");
            System.out.println("3. Search Order");
            System.out.println("4. Update Order");
            System.out.println("5. Delete Order");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String item = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Status (Placed/Served/Billed): ");
                    String status = sc.nextLine();

                    Order order = new Order(id, customer, item, qty, price, status);
                    manager.placeOrder(order);
                    break;

                case 2:
                    manager.viewOrders();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Customer Name or Status: ");
                    String key = sc.nextLine();
                    manager.search(key);
                    break;

                case 4:

                    System.out.print("Enter Order ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Status: ");
                    String newStatus = sc.nextLine();

                    manager.updateOrder(updateId, newQty, newStatus);
                    break;

                case 5:

                    System.out.print("Enter Order ID: ");
                    int deleteId = sc.nextInt();

                    manager.deleteOrder(deleteId);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}