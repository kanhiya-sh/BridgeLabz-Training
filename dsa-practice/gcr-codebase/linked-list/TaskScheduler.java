package BridgeLabz_Day20_LinkedList;

public class TaskScheduler {
    class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;
    }

    private Node head;
    private int size;

    // Add at Beginning
    public void addFirst(int id, String name, int priority, String date) {
        Node nn = new Node();
        nn.taskId = id;
        nn.taskName = name;
        nn.priority = priority;
        nn.dueDate = date;

        if (head == null) {
            head = nn;
            nn.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            nn.next = head;
            temp.next = nn;
            head = nn;
        }
        size++;
    }

    // Add at End
    public void addLast(int id, String name, int priority, String date) {
        if (head == null) {
            addFirst(id, name, priority, date);
            return;
        }

        Node nn = new Node();
        nn.taskId = id;
        nn.taskName = name;
        nn.priority = priority;
        nn.dueDate = date;

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = head;
        size++;
    }

    // Add at Specific Position
    public void addAtIndex(int k, int id, String name, int priority, String date) throws Exception {
        if (k == 0) {
            addFirst(id, name, priority, date);
            return;
        }
        if (k < 0 || k > size) {
            throw new Exception("Invalid index");
        }

        Node nn = new Node();
        nn.taskId = id;
        nn.taskName = name;
        nn.priority = priority;
        nn.dueDate = date;

        Node temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
        size++;
    }

    // Remove Task by Task ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            size--;
            return;
        }

        Node curr = head;
        while (curr.next != head && curr.next.taskId != id) {
            curr = curr.next;
        }

        if (curr.next.taskId == id) {
            curr.next = curr.next.next;
            size--;
        }
    }

    // View Current Task and Move to Next
    public void viewAndMoveNext() {
        if (head == null) return;

        System.out.println(
                head.taskId + "\t" +
                        head.taskName + "\t" +
                        head.priority + "\t" +
                        head.dueDate
        );
        head = head.next;
    }

    // Display All Tasks
    public void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.println(
                    temp.taskId + "\t" +
                            temp.taskName + "\t" +
                            temp.priority + "\t" +
                            temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search Task by Priority
    public void searchByPriority(int p) {
        if (head == null) return;

        Node temp = head;
        do {
            if (temp.priority == p) {
                System.out.println(
                        temp.taskId + "\t" +
                                temp.taskName + "\t" +
                                temp.priority + "\t" +
                                temp.dueDate
                );
            }
            temp = temp.next;
        } while (temp != head);
    }
}
