package Day_25.Team_Project;
import java.util.ArrayList;
import java.util.Scanner;

// Product Class
class Product {
    private int productId;
    private String name;
    private String category;
    private int quantity;
    private double unitPrice;

    public Product(int productId, String name, String category, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "---------------------------------\n" +
                "Product ID : " + productId +
                "\nName       : " + name +
                "\nCategory   : " + category +
                "\nQuantity   : " + quantity +
                "\nUnit Price : " + unitPrice;
    }
}

// Inventory Manager Class
class InventoryManager {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product Added Successfully.");
    }

    // View All Products
    public void viewProducts() {

        if (products.isEmpty()) {
            System.out.println("No Products Available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);

            if (p.getQuantity() < 10) {
                System.out.println("*** Low Stock Warning ***");
            }
        }
    }

    // Search by Category
    public void searchCategory(String category) {

        boolean found = false;

        for (Product p : products) {

            if (p.getCategory().equalsIgnoreCase(category)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Category Not Found.");
        }
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {

        for (Product p : products) {

            if (p.getProductId() == id) {

                p.setQuantity(quantity);
                p.setUnitPrice(price);

                System.out.println("Product Updated Successfully.");
                return;
            }
        }

        System.out.println("Product ID Not Found.");
    }

    // Delete Product
    public void deleteProduct(int id) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getProductId() == id) {

                products.remove(i);
                System.out.println("Product Deleted Successfully.");
                return;
            }
        }

        System.out.println("Product ID Not Found.");
    }
}

// Main Class
public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by Category");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Unit Price: ");
                    double price = sc.nextDouble();

                    Product product = new Product(id, name, category, quantity, price);
                    manager.addProduct(product);
                    break;

                case 2:
                    manager.viewProducts();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String searchCategory = sc.nextLine();
                    manager.searchCategory(searchCategory);
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    System.out.print("Enter New Unit Price: ");
                    double newPrice = sc.nextDouble();

                    manager.updateProduct(updateId, newQuantity, newPrice);
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    int deleteId = sc.nextInt();
                    manager.deleteProduct(deleteId);
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