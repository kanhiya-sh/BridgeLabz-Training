package BridgeLabz_Day20_LinkedList;

public class UndoRedoLinkedList {
    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.display();
        editor.undo();
        System.out.println("------------------");
        System.out.println("After Undo");
        editor.display();
        editor.undo();
        editor.display();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("After Redo");
        editor.redo();
        editor.display();
        System.out.println("------------------");
    }
}
