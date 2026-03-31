package Capgemini_Day12_class_object;

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee Salary is : " + salary);
    }
}
public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayDetails();
    }
}
