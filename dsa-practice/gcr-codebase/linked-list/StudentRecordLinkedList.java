package BridgeLabz_Day20_LinkedList;

public class StudentRecordLinkedList {
    public static void main(String[] args) throws Exception {
        StudentRecord list = new StudentRecord();
        list.addAtBeginning(1, "Bhavy", 20, "A");
        list.addAtEnd(2, "Naman", 21, "B");
        list.addAtPosition(1, 3, "Mansi", 19, "A");

        list.display();

        list.updateGrade(1, "A+");
        list.deleteByRoll(2);

        System.out.println("After Operations:");
        list.display();
        list.searchByRoll(3);
    }
}
