package constructorAndInstance;

class Student {

    public int rollNumber;        // accessible everywhere
    protected String name;        // accessible in subclass
    private double cgpa;          // accessible only inside this class

    // setter method for private variable
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // getter method
    public double getCGPA() {
        return cgpa;
    }
}

// this is the subclass
class PostgraduateStudent extends Student {

    void displayDetails() {
        // accessing public and protected members
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgraduateStudent ps = new PostgraduateStudent();
        ps.rollNumber = 33;
        ps.name = "Kanhiya";
        ps.setCGPA(8.5);
        ps.displayDetails();
        System.out.println("CGPA: " + ps.getCGPA());
	}

}
