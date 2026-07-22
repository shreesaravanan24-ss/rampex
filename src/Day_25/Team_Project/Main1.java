package Day_25.Team_Project;

import java.util.ArrayList;
import java.util.Scanner;

// Entity Class
class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int totalCopies;
    private int availableCopies;

    public Book(int bookId, String title, String author, String category,
                int totalCopies, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return "---------------------------" +
                "\nBook ID : " + bookId +
                "\nTitle : " + title +
                "\nAuthor : " + author +
                "\nCategory : " + category +
                "\nTotal Copies : " + totalCopies +
                "\nAvailable Copies : " + availableCopies;
    }
}

// Manager Class
class LibraryManager {

    ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    // View All Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Search Book
    public void searchBook(String key) {
        boolean found = false;

        for (Book b : books) {

            if (b.getTitle().equalsIgnoreCase(key) ||
                    b.getAuthor().equalsIgnoreCase(key)) {

                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    // Update Book
    public void updateBook(int id, Scanner sc) {

        for (Book b : books) {

            if (b.getBookId() == id) {

                sc.nextLine();

                System.out.print("Enter New Title: ");
                b.setTitle(sc.nextLine());

                System.out.print("Enter New Author: ");
                b.setAuthor(sc.nextLine());

                System.out.print("Enter New Category: ");
                b.setCategory(sc.nextLine());

                System.out.print("Enter Total Copies: ");
                b.setTotalCopies(sc.nextInt());

                System.out.print("Enter Available Copies: ");
                b.setAvailableCopies(sc.nextInt());

                System.out.println("Book Updated Successfully.");
                return;
            }
        }

        System.out.println("Book ID Not Found.");
    }

    // Delete Book
    public void deleteBook(int id) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == id) {

                books.remove(i);
                System.out.println("Book Removed Successfully.");
                return;
            }
        }

        System.out.println("Book ID Not Found.");
    }
}

// Main Class
public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Remove Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Total Copies: ");
                    int total = sc.nextInt();

                    System.out.print("Enter Available Copies: ");
                    int available = sc.nextInt();

                    Book book = new Book(id, title, author, category, total, available);
                    manager.addBook(book);
                    break;

                case 2:
                    manager.viewBooks();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Title or Author: ");
                    String key = sc.nextLine();
                    manager.searchBook(key);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int updateId = sc.nextInt();
                    manager.updateBook(updateId, sc);
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int deleteId = sc.nextInt();
                    manager.deleteBook(deleteId);
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