package BridgeLabz_Day20_LinkedList;

public class RoundRobinLinkedList {
    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);
        System.out.println("Initial Process Queue : ");
        rr.display();
        int timeQuantum = 3;
        rr.roundRobin(timeQuantum);
    }
}
