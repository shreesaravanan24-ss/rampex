package Day_25.Home_Task;

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class HighestSalaryDepartment {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1,"Ram","IT",50000),
                new Employee(2,"Sam","HR",60000),
                new Employee(3,"Raj","IT",80000),
                new Employee(4,"Tom","HR",55000)
        );

        Map<String, Employee> result = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::getSalary)),
                                Optional::get
                        )
                ));

        System.out.println(result);
    }
}