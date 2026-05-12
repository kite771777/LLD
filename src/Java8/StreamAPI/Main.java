package Java8.StreamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // ✅ List of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice",   30, "HR",          55000));
        employees.add(new Employee("Bob",     22, "IT",          40000));
        employees.add(new Employee("Charlie", 35, "Finance",     70000));
        employees.add(new Employee("Diana",   28, "IT",          60000));
        employees.add(new Employee("Eve",     20, "HR",          35000));
        employees.add(new Employee("Frank",   45, "Finance",     90000));
        employees.add(new Employee("Grace",   26, "Marketing",   50000));
        employees.add(new Employee("Hank",    23, "IT",          42000));
        employees.add(new Employee("Ivy",     33, "HR",          65000));
        employees.add(new Employee("Jack",    29, "Marketing",   58000));

        System.out.println("===== All Employees =====");
        employees.forEach(System.out::println);
        List<String> p=employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("Names");
        System.out.println(p);

        // ✅ Your Practice Problem
        List<String> names = employees.stream()
                .filter(e -> e.getAge() > 25)       // Intermediate - filter age > 25
                .map(Employee::getName)              // Intermediate - get only names
                .sorted()                            // Intermediate - sort alphabetically
                .collect(Collectors.toList());       // Terminal - collect to list

        System.out.println("\n===== Names with Age > 25 (Sorted) =====");
        names.forEach(System.out::println);

        // ✅ Extra Practice 2 - Filter by Salary > 50000
        List<String> highSalary = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n===== Employees with Salary > 50000 =====");
        highSalary.forEach(System.out::println);

        // ✅ Extra Practice 3 - Count employees per department
        System.out.println("\n===== Count by Department =====");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((dept, count) -> System.out.println(dept + ": " + count));

        // ✅ Extra Practice 4 - Average salary
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("\n===== Average Salary =====");
        System.out.println("Avg Salary: " + avgSalary);

    }
}
