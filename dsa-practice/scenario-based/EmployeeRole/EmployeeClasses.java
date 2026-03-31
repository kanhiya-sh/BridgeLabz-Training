package BridgeLabz_Day28_ScenarioBased.EmployeeRole;

abstract class Employee {
    private final String name;
    private final double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    protected double getSalary() {
        return salary;
    }
    abstract double getBonus();
}
class Manager extends Employee {
    private final double bonus;
    Manager(String name, double salary) {
        super(name, salary);
        this.bonus = salary * 0.10;
    }
    double getBonus() {
        return bonus;
    }
}
class Developer extends Employee {
    private final double bonus;
    Developer(String name, double salary) {
        super(name, salary);
        if (salary > 50000) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }
    }
    double getBonus() {
        return bonus;
    }
}
