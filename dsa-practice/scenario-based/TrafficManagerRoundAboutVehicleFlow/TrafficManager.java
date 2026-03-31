package BridgeLabz_Day22_ScenarioBased_OOPS.TrafficManagerRoundAboutVehicleFlow;

import java.util.*;
public class TrafficManager {
    class CarNode {
        String carNo;
        CarNode next;

        CarNode(String carNo) {
            this.carNo = carNo;
        }
    }
    private CarNode head = null;
    // Add car to roundabout
    public void addCarToRoundabout(String carNo) {
        CarNode nn = new CarNode(carNo);
        if (head == null) {
            head = nn;
            nn.next = head;
        }
        else {
            CarNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        }
    }
    // Remove car from roundabout
    public void removeCarFromRoundabout(String carNo) {
        if (head == null) return;
        if (head.carNo.equals(carNo)) {
            if (head.next == head) {
                head = null;
            }
            else {
                CarNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        CarNode curr = head;
        while (curr.next != head && !curr.next.carNo.equals(carNo)) {
            curr = curr.next;
        }
        if (curr.next.carNo.equals(carNo)) {
            curr.next = curr.next.next;
        }
    }
    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }
        System.out.print("Roundabout: ");
        CarNode temp = head;
        do {
            System.out.print(temp.carNo + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

    private String[] queue = new String[5];
    private int front = 0;
    private int rear = -1;
    private int qSize = 0;

    public void enqueue(String carNo) {
        if (qSize == queue.length) {
            System.out.println("Queue Overflow! Car " + carNo + " cannot enter.");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = carNo;
        qSize++;
    }

    public String dequeue() {
        if (qSize == 0) {
            System.out.println("Queue Underflow! No car waiting.");
            return null;
        }
        String car = queue[front];
        front = (front + 1) % queue.length;
        qSize--;
        return car;
    }

    public void printQueue() {
        if (qSize == 0) {
            System.out.println("Waiting Queue is empty");
            return;
        }
        System.out.print("Waiting Queue: ");
        for (int i = 0; i < qSize; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}
