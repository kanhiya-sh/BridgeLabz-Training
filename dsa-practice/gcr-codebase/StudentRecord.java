package BridgeLabz_Day20_LinkedList;

public class StudentRecord {
    class StudentNode {
        int rollNumber;
        String name;
        int age;
        String grade;
        StudentNode next;
    }
    private StudentNode head;
    private StudentNode tail;
    private int size;

//  adding a node at the beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode nn = new StudentNode();
        nn.rollNumber = roll;
        nn.name = name;
        nn.age = age;
        nn.grade = grade;
        if(size == 0) {
            head = nn;
            tail = nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
        size++;
    }
//    adding a node at the end
    public void addAtEnd(int roll, String name, int age, String grade) {
        if(size == 0) {
            addAtBeginning(roll, name, age, grade);
        }
        else {
            StudentNode nn = new StudentNode();
            nn.rollNumber = roll;
            nn.name = name;
            nn.age = age;
            nn.grade = grade;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
//    adding a node at a given position
    public void addAtPosition(int pos, int roll, String name, int age, String grade) throws Exception {
        if(pos == 0) {
            addAtBeginning(roll, name, age, grade);
        }
        else if (pos == size) {
            addAtEnd(roll, name, age, grade);
        }
        else {
            StudentNode nn = new StudentNode();
            nn.rollNumber = roll;
            nn.name = name;
            nn.age = age;
            nn.grade = grade;

            StudentNode prev = getNode(pos - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }
    // Deleting by Roll Number
    public void deleteByRoll(int roll) {
        if (size == 0) return;
        if (head.rollNumber == roll) {
            head = head.next;
            size--;
            return;
        }
        StudentNode prev = head;
        while (prev.next != null && prev.next.rollNumber != roll) {
            prev = prev.next;
        }
        if (prev.next != null) {
            if (prev.next == tail) {
                tail = prev;
            }
            prev.next = prev.next.next;
            size--;
        }
    }

    // Search by Roll Number
    public void searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade by Roll Number
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display All Records
    public void display() {
        StudentNode temp = head;

        System.out.println("----------------------------------------");
        System.out.println("Roll No.\tName\tAge\tGrade");
        System.out.println("----------------------------------------");

        while (temp != null) {
            System.out.println(
                    temp.rollNumber + "\t\t\t" +
                            temp.name + "\t" +
                            temp.age + "\t" +
                            temp.grade
            );
            temp = temp.next;
        }

        System.out.println("----------------------------------------");
    }

    private StudentNode getNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Index out of range");
        }
        StudentNode temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
