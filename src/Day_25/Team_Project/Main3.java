package Day_25.Team_Project;

import java.util.*;

// Employee Class
class Employee {
    private int employeeId;
    private String name;
    private String department;
    private String designation;
    private double salary;

    public Employee(int employeeId, String name, String department, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "----------------------------" +
                "\nEmployee ID : " + employeeId +
                "\nName        : " + name +
                "\nDepartment  : " + department +
                "\nDesignation : " + designation +
                "\nSalary      : " + salary;
    }
}

// Manager Class
class EmployeeManager {

    ArrayList<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added Successfully.");
    }

    // View All Employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.");
            return;
        }

        HashMap<String, Integer> count = new HashMap<>();

        for (Employee e : employees) {
            System.out.println(e);

            count.put(e.getDepartment(),
                    count.getOrDefault(e.getDepartment(), 0) + 1);
        }

        System.out.println("\nDepartment Head Count");
        for (String dept : count.keySet()) {
            System.out.println(dept + " : " + count.get(dept));
        }
    }

    // Search by Department
    public void searchDepartment(String dept) {

        boolean found = false;

        for (Employee e : employees) {

            if (e.getDepartment().equalsIgnoreCase(dept)) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found)
            System.out.println("Department Not Found.");
    }

    // Update Employee
    public void updateEmployee(int id, String designation, double salary) {

        for (Employee e : employees) {

            if (e.getEmployeeId() == id) {

                e.setDesignation(designation);
                e.setSalary(salary);

                System.out.println("Employee Updated Successfully.");
                return;
            }
        }

        System.out.println("Employee ID Not Found.");
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getEmployeeId() == id) {

                employees.remove(i);
                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee ID Not Found.");
    }
}

// Main Class
public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search by Department");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, department, designation, salary);
                    manager.addEmployee(emp);
                    break;

                case 2:
                    manager.viewEmployees();
                    break;

                case 3:

                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    manager.searchDepartment(dept);
                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Designation: ");
                    String newDesignation = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    manager.updateEmployee(updateId, newDesignation, newSalary);
                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    manager.deleteEmployee(deleteId);
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