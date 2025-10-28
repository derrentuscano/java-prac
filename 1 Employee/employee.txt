import java.util.Scanner;

// Employee class
class Employee {
    int employeeId;
    String name;
    double salary;

    // Parameterized constructor
    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------------");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first employee
        System.out.print("Enter Employee 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee 1 Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Employee 1 Salary: ");
        double salary1 = sc.nextDouble();

        sc.nextLine(); // consume newline

        // Input for second employee
        System.out.print("\nEnter Employee 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee 2 Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Employee 2 Salary: ");
        double salary2 = sc.nextDouble();

        // Creating Employee objects
        Employee emp1 = new Employee(id1, name1, salary1);
        Employee emp2 = new Employee(id2, name2, salary2);

        // Displaying details
        System.out.println("\n=== Employee Details ===");
        emp1.displayDetails();
        emp2.displayDetails();

        sc.close();
    }
}
