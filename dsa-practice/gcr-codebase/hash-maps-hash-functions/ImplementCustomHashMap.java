package BridgeLabz_Day24_HashMapHashFunctions;

import java.util.*;
public class ImplementCustomHashMap<K, V> {
    class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    private ArrayList<Node> buckets;
    private int capacity;

    // Constructor
    public ImplementCustomHashMap() {
        capacity = 10;
        buckets = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            buckets.add(null);
        }
    }
    // Hash function
    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
    // ----- INSERT -----
    public void put(K key, V value) {
        int index = hashFunction(key);
        Node head = buckets.get(index);
        // If key already exists, update value
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        // Insert new node at head (separate chaining)
        Node newNode = new Node(key, value);
        newNode.next = buckets.get(index);
        buckets.set(index, newNode);
    }

    // ---- RETRIEVE ----
    public V get(K key) {
        int index = hashFunction(key);
        Node head = buckets.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    // ----- DELETE -----
    public V remove(K key) {
        int index = hashFunction(key);
        Node curr = buckets.get(index);
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        if (prev == null) {
            buckets.set(index, curr.next);
        }
        else {
            prev.next = curr.next;
        }
        return curr.value;
    }
}
