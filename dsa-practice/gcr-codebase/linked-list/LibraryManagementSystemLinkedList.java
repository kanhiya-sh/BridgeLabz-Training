package BridgeLabz_Day20_LinkedList;

public class LibraryManagementSystemLinkedList {
    public static void main(String[] args) throws Exception {
        LibraryManagementSystem lib = new LibraryManagementSystem();
        lib.addFirst("Java Basics", "James", "Programming", 101, true);
        lib.addLast("Python Guide", "Rossum", "Programming", 102, true);
        lib.addAtIndex(1, "DSA", "Narasimha", "CS", 103, false);
        System.out.println("Books (Forward):");
        lib.displayForward();
        lib.updateAvailability(103, true);
        lib.removeById(102);
        System.out.println("After Operations:");
        lib.displayForward();
        System.out.println("Search by Title:");
        lib.searchByTitle("DSA");
        System.out.println("Search by Author:");
        lib.searchByAuthor("James");
        System.out.println("Books (Reverse):");
        lib.displayReverse();
        lib.countBooks();
    }
}
