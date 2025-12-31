package constructorAndInstance;

class Course {
    // instance variables
    String courseName;
    int duration;
    double fee;

    // class variable
    static String instituteName = "GLA University";

    // constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + ", Fee: " + fee + ", Institute: " + instituteName);
    }

    // class method
    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

public class OnlineCourseManagement {

	public static void main(String[] args) {
		
		// creating course objects
        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Cloud Computing", 8, 20000);

        // displaying details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // updating institute name using static method
        Course.updateInstituteName("BridgeLabz");

        // displaying details again after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();

	}

}
