package Capgemini_Day14_this_static_final;

class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void updateGrade(String newGrade, Object obj) {
        if (obj instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        }
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {

    }
}
