package BridgeLabz_Day20_LinkedList;

public class TaskSchedulerLinkedList {
    public static void main(String[] args) throws Exception {
        TaskScheduler tasks = new TaskScheduler();

        tasks.addFirst(1, "Assignment", 1, "10-09-2025");
        tasks.addLast(2, "Project", 2, "15-09-2025");
        tasks.addAtIndex(1, 3, "Exam Prep", 1, "12-09-2025");

        System.out.println("All Tasks:");
        tasks.display();

        System.out.println("Current Task:");
        tasks.viewAndMoveNext();

        System.out.println("After Moving to Next:");
        tasks.display();

        System.out.println("Search by Priority 1:");
        tasks.searchByPriority(1);

        tasks.removeById(2);

        System.out.println("After Removing Task:");
        tasks.display();
    }
}
