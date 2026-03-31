package BridgeLabz_Day22_ScenarioBased_OOPS.StudentCourseRegistrationSystem;
import java.util.*;

class CourseLimitExceededException extends Exception {
  public CourseLimitExceededException(String message) {
    super(message);
  }
}

// 2. Abstraction (Interface)
interface RegistrationService {
  void registerCourse(String courseName) throws CourseLimitExceededException;
  void dropCourse(String courseName);
}

// 3. Inheritance (Base Class)
class Person {
  protected String name;
  protected int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

// 4. Encapsulation & Core Logic (Student Class)
class Student extends Person implements RegistrationService {
  private int studentId;
  private ArrayList<String> enrolledCourses;
  private ArrayList<String> grades;
  private static final int MAX_COURSES = 3;
  public Student(int studentId, String name, int age) {
    super(name, age);
    this.studentId = studentId;
    this.enrolledCourses = new ArrayList<>();
    this.grades = new ArrayList<>();
  }

  public int getStudentId() {
    return studentId;
  }
  public String getName() {
    return name;
  }

  @Override
  public void registerCourse(String courseName) throws CourseLimitExceededException {
    if (enrolledCourses.size() >= MAX_COURSES) {
      throw new CourseLimitExceededException("Cannot enroll in more than " + MAX_COURSES + " courses.");
    }

    // Checking if already enrolled
    if (enrolledCourses.contains(courseName)) {
      System.out.println("Already enrolled in " + courseName);
    }
    else {
      enrolledCourses.add(courseName);
      grades.add("N/A");
      System.out.println(name + " successfully enrolled in " + courseName);
    }
  }

  @Override
  public void dropCourse(String courseName) {
    if (enrolledCourses.contains(courseName)) {
      int index = enrolledCourses.indexOf(courseName);
      enrolledCourses.remove(index);
      grades.remove(index);
      System.out.println("Course " + courseName + " dropped.");
    }
    else {
      System.out.println("Student is not enrolled in this course.");
    }
  }

  // Grade Management
  public void assignGrade(String courseName, String grade) {
    if (enrolledCourses.contains(courseName)) {
      int index = enrolledCourses.indexOf(courseName);
      grades.set(index, grade);
      System.out.println("Grade updated for " + courseName);
    } else {
      System.out.println("Error: Student not enrolled in " + courseName);
    }
  }

  public void viewTranscript() {
    System.out.println("\n--- Transcript for " + name + " (ID: " + studentId + ") ---");
    if (enrolledCourses.isEmpty()) {
      System.out.println("No courses enrolled.");
    }
    else {

      for (int i = 0; i < enrolledCourses.size(); i++) {
        System.out.println("Course: " + enrolledCourses.get(i) + " | Grade: " + grades.get(i));
      }
    }
    System.out.println("-----------------------------------");
  }
}