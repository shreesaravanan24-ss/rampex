package Day_26;
import java.util.ArrayList;
import java.util.Scanner;

class Order {

    // Order Class

    int orderId;
    String customerName;
    String itemName;
    int quantity;
    double price;
    String status;

    // Constructor
    Order(int orderId, String customerName, String itemName,
          int quantity, double price, String status) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    // Calculate Bill
    double calculateBill() {
        return quantity * price;
    }

    // Display Order Details
    void display() {
        System.out.println("\n------------------------------");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Item Name     : " + itemName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Status        : " + status);
        System.out.println("Total Bill    : " + calculateBill());
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList to store orders
        ArrayList<Order> orders = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Restaurant Order & Billing System =====");
            System.out.println("1. Place Order");
            System.out.println("2. View Orders");
            System.out.println("3. Search by Customer");
            System.out.println("4. Search by Status");
            System.out.println("5. Update Order");
            System.out.println("6. Delete Order");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Place Order
                case 1:

                    System.out.print("Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Item Name: ");
                    String item = sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status (placed/served/billed): ");
                    String status = sc.nextLine();

                    orders.add(new Order(id, customer, item, quantity, price, status));

                    System.out.println("Order Placed Successfully!");
                    break;

                // View Orders
                case 2:

                    if (orders.isEmpty()) {
                        System.out.println("No Orders Found.");
                    } else {
                        for (Order o : orders) {
                            o.display();
                        }
                    }
                    break;

                // Search by Customer
                case 3:

                    System.out.print("Enter Customer Name: ");
                    String cname = sc.nextLine();

                    boolean found = false;

                    for (Order o : orders) {
                        if (o.customerName.equalsIgnoreCase(cname)) {
                            o.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Customer Not Found.");

                    break;

                // Search by Status
                case 4:

                    System.out.print("Enter Status: ");
                    String searchStatus = sc.nextLine();

                    found = false;

                    for (Order o : orders) {
                        if (o.status.equalsIgnoreCase(searchStatus)) {
                            o.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("No Orders Found.");

                    break;

                // Update Order
                case 5:

                    System.out.print("Enter Order ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Status: ");
                    String newStatus = sc.nextLine();

                    found = false;

                    for (Order o : orders) {
                        if (o.orderId == updateId) {
                            o.quantity = newQty;
                            o.status = newStatus;
                            System.out.println("Order Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Order Not Found.");

                    break;

                // Delete Order
                case 6:

                    System.out.print("Enter Order ID: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < orders.size(); i++) {
                        if (orders.get(i).orderId == deleteId) {
                            orders.remove(i);
                            System.out.println("Order Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Order Not Found.");

                    break;

                // Exit
                case 7:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                // Invalid Choice
                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}