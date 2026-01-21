package BridgeLabz_Day29_Generics.UniversityCourses;

import java.util.*;
public class CourseMain {
    public static void main(String[] args) {
        List<CourseType> coursesList = new ArrayList<>();
        coursesList.add(new ExamCourse());
        coursesList.add(new AssignmentCourse());
        display(coursesList);
    }
    public static void display(List<? extends CourseType> ll) {
        for (CourseType c : ll) {
            c.show();
        }
    }
}