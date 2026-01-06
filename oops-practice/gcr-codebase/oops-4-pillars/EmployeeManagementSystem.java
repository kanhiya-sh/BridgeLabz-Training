package BridgeLabz_Day17_4Pillars;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;

//    creating constructor of the Employee class
    Employee(String employeeId , String name , double baseSalary ) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    public String getDepartmentDetails() {
        return department;
    }
    abstract double calculateSalary() ; //this is the abstract method
    void displayDetails() {
        System.out.println("Employee ID is : " + employeeId);
        System.out.println("Name of the employee : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + calculateSalary());
        System.out.println("----------------------");
    }
}
//    now creating two subclasses FullTimeEmployee and PartTimeEmployee
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String id, String name, double salary) {
        super(id, name, salary);
    }
    double calculateSalary() {
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Emp101", "Amit", 50000);
        Employee emp2 = new PartTimeEmployee("Emp102", "Riya", 40, 500);
        emp1.assignDepartment("IT");
        emp2.assignDepartment("HR");
        Employee[] employees = { emp1, emp2 };
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
