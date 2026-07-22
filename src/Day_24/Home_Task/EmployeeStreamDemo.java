package Day_24.Home_Task;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeStreamDemo {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 65000),
                new Employee(2, "Alice", "HR", 45000),
                new Employee(3, "Bob", "IT", 70000),
                new Employee(4, "David", "Sales", 50000),
                new Employee(5, "Emma", "IT", 90000)
        );

        // 1. Employees earning more than 60000
        System.out.println("Salary > 60000");
        employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .forEach(System.out::println);

        // 2. Print employee names
        System.out.println("\nEmployee Names");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // 3. Highest-paid employee
        Employee highest = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("\nHighest Paid Employee");
        System.out.println(highest);

        // 4. Average salary
        double avg = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.println("\nAverage Salary = " + avg);

        // 5. Group by department
        System.out.println("\nGroup By Department");
        Map<String, List<Employee>> group =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        group.forEach((dept, emp) -> {
            System.out.println(dept + " -> " + emp);
        });

        // 6. Count employees in each department
        System.out.println("\nEmployee Count");
        Map<String, Long> count =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()));

        count.forEach((dept, c) -> {
            System.out.println(dept + " = " + c);
        });

        // 7. Sort by salary descending
        System.out.println("\nSalary Descending");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        // 8. Collect only IT employee names
        System.out.println("\nIT Employee Names");
        List<String> itNames = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(itNames);
    }
}