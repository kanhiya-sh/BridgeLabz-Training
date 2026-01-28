package BridgeLabz_Day33_ScenarioBased.EduResult;

public class EduResultMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Bhavy", 85),
                new Student(102, "Naman", 92),
                new Student(103, "Arsh", 85),
                new Student(104, "Akarsh", 78),
                new Student(105, "Krish", 92)
        };
        MergeSort.sort(students, 0, students.length - 1);
        System.out.println("State-wise Rank List : ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
