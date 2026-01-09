package BridgeLabz_Day20_LinkedList;

public class RoundRobin {
        class Node {
            int processId;
            int burstTime;
            int priority;
            int remainingTime;
            Node next;

            Node(int processId, int burstTime, int priority) {
                this.processId = processId;
                this.burstTime = burstTime;
                this.remainingTime = burstTime;
                this.priority = priority;
            }
        }

        private Node head = null;
        private Node tail = null;
        private int size = 0;

        // Add process at end
        public void addProcess(int processId, int burstTime, int priority) {
            Node nn = new Node(processId, burstTime, priority);

            if (head == null) {
                head = tail = nn;
                nn.next = head;
            } else {
                tail.next = nn;
                tail = nn;
                tail.next = head;
            }
            size++;
        }

        // Remove process by processId
        public void removeProcess(Node prev, Node curr) {
            if (curr == head && curr == tail) {
                head = tail = null;
            }
            else if (curr == head) {
                head = head.next;
                tail.next = head;
            }
            else if (curr == tail) {
                tail = prev;
                tail.next = head;
            }
            else {
                prev.next = curr.next;
            }
            size--;
        }

        // Display processes
        public void display() {
            if (head == null) {
                return;
            }
            Node temp = head;
            do {
                System.out.println("processId: " + temp.processId +
                        " | Remaining Time: " + temp.remainingTime +
                        " | Priority: " + temp.priority);
                temp = temp.next;
            }
            while (temp != head);
        }

        // Round Robin Scheduling
        public void roundRobin(int timeQuantum) {
            if (head == null) return;
            int time = 0;
            int totalWaitingTime = 0;
            int totalTurnAroundTime = 0;
            int processCount = size;
            Node curr = head;
            Node prev = tail;
            while (size > 0) {
                System.out.println("\nExecuting Process processId: " + curr.processId);
                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                }
                else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;
                    totalTurnAroundTime += time;
                    totalWaitingTime += time - curr.burstTime;
                    Node nextNode = curr.next;
                    removeProcess(prev, curr);
                    curr = nextNode;
                    display();
                    continue;
                }
                prev = curr;
                curr = curr.next;
                display();
            }
            System.out.println("\nAverage Waiting Time: " +
                    (double) totalWaitingTime / processCount);
            System.out.println("Average Turn Around Time: " +
                    (double) totalTurnAroundTime / processCount);
        }
}
