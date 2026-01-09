package BridgeLabz_Day20_LinkedList;

public class MovieManagementSystemLinkedList {
    public static void main(String[] args) throws Exception {
        MovieManagementSystem list = new MovieManagementSystem();
        list.addFirst("Inception", "Nolan", 2010, 9.0);
        list.addLast("Interstellar", "Nolan", 2014, 8.8);
        list.addAtIndex(1, "Avatar", "Cameron", 2009, 8.0);


        list.displayForward();

        list.updateRating("Avatar", 8.5);
        list.removeByTitle("Interstellar");

        System.out.println("After Operations :");
        list.displayForward();


        list.displayReverse();
    }
}
