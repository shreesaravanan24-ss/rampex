package Day_25.Home_Task;

import java.util.*;
import java.util.stream.*;

class employee {
    int id;
    String name;
    String department;
    double salary;

    employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1,"Ram","IT",50000),
                new Employee(2,"Sam","HR",60000),
                new Employee(3,"Raj","IT",80000),
                new Employee(4,"Tom","HR",60000)
        );

        Optional<Double> second = list.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(second.orElse(0.0));
    }
}