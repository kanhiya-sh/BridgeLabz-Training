package BridgeLabz_Day22_ScenarioBased_OOPS.StudentCourseRegistrationSystem;

import java.util.*;

public class StudentCourseRegistrationMain {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();

    studentList.add(new Student(101, "Bhavy", 20));
    studentList.add(new Student(102, "Naman", 21));

    while (true) {
      System.out.println("\n=== Student Course Registration System ===");
      System.out.println("1. Add New Student");
      System.out.println("2. Enroll Student in Course");
      System.out.println("3. Drop Course");
      System.out.println("4. Assign Grade");
      System.out.println("5. View Student Transcript");
      System.out.println("6. Exit");
      System.out.print("Enter Your Choice: ");

      int choice = myScan.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter ID : ");
          int id = myScan.nextInt();
          System.out.print("Enter Name : ");
          String name = myScan.next();
          System.out.print("Enter Age : ");
          int age = myScan.nextInt();
          studentList.add(new Student(id, name, age));
          System.out.println("Student Registered Successfully!");
          break;

        case 2:
          System.out.print("Enter Student ID : ");
          int enrollId = myScan.nextInt();
          Student enrollStudent = findStudent(studentList, enrollId);
          if (enrollStudent != null) {
            System.out.print("Enter Course Name : ");
            String course = myScan.next();
            try {
              enrollStudent.registerCourse(course);
            } 
            catch (CourseLimitExceededException e) {
              System.out.println("Exception : " + e.getMessage());
            }
          } else {
            System.out.println("Student not found!");
          }
          break;

        case 3:
          System.out.print("Enter Student ID : ");
          int dropId = myScan.nextInt();
          Student sDrop = findStudent(studentList, dropId);
          if (sDrop != null) {
            System.out.print("Enter Course Name to Drop : ");
            sDrop.dropCourse(myScan.next());
          }
          else {
            System.out.println("Student not found!");
          }
          break;

        case 4:
          System.out.print("Enter Student ID : ");
          int gradeId = myScan.nextInt();
          Student sGrade = findStudent(studentList, gradeId);
          if (sGrade != null) {
            System.out.print("Enter Course Name : ");
            String cName = myScan.next();
            System.out.print("Enter Grade (A/B/C) : ");
            String grade = myScan.next();
            sGrade.assignGrade(cName, grade);
          } else {
            System.out.println("Student not found!");
          }
          break;

        case 5:
          System.out.print("Enter Student ID : ");
          int viewId = myScan.nextInt();
          Student sView = findStudent(studentList, viewId);
          if (sView != null) {
            sView.viewTranscript();
          } else {
            System.out.println("Student not found!");
          }
          break;

        case 6:
          System.out.println("Exiting System...");
          System.exit(0);

        default:
          System.out.println("Invalid Choice!");
      }
    }
  }

  private static Student findStudent(ArrayList<Student> list, int id) {
    for (Student s : list) {
      if (s.getStudentId() == id) {
        return s;
      }
    }
    return null;
  }
}
