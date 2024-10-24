package akash;

// Parent class User with id and name
class User {
    protected int id;
    protected String name;

    // Parameterized constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Subclass Employee inheriting from User
class Employee extends User {
    private double salary; // Monthly salary of the employee

    // Constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name); // Call parent class constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Monthly salary * 12 months
    }
}

// Main class to test the program
public class SalaryCalculator {
    public static void main(String[] args) {
        // Create an Employee object with sample data
        Employee emp = new Employee(101, "John Doe", 50000);

        // Calculate and display the annual salary
        double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Annual Salary of " + emp.name + ": " + annualSalary);
    }
}
