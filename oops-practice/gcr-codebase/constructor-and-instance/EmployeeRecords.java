package constructorAndInstance;

class Employee {

	public int employeeID;        
	protected String department;  
	private double salary;        

	// method to modify private variable
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

//this is the subclass
class Manager extends Employee {

	void displayEmployeeInfo() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
	}
}

public class EmployeeRecords {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.employeeID = 501;
		m.department = "IT";
		m.setSalary(90000);
		m.displayEmployeeInfo();
		System.out.println("Salary: " + m.getSalary());
	}
}