package BridgeLabz_Day29_Generics.UniversityCourses;

abstract class CourseType {
    String type;
    CourseType(String type) { this.type = type; }
    void show() { System.out.println(type); }
}

class ExamCourse extends CourseType {
    ExamCourse() { super("Exam Based Course"); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() { super("Assignment Based Course"); }
}

class Course<T extends CourseType> {
    T course;
    Course(T course) { this.course = course; }
}