package BridgeLabz_Day30_Collections;

public class CircularBuffer {
    int[] arr;
    int size;
    int index=0;

    CircularBuffer(int s){
        size=s;
        arr = new int[s];
    }
    public void insert(int x) {
        arr[index++ % size] = x ;
    }
    public void display() {
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.display();
    }
}