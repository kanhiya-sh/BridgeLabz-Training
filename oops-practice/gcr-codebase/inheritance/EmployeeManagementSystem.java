package Capgemini_Day16_Inheritance;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Salary : $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Manager");
        System.out.println("Team Size : " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Developer");
        System.out.println("Language : " + programmingLanguage);
    }
}

class Intern extends Employee {
    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Intern");
        System.out.println("Duration : " + durationMonths + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Kanhiya", 101, 90000, 8);
        Employee e2 = new Developer("Naman", 102, 60000, "Java");
        Employee e3 = new Intern("Bhavy", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
