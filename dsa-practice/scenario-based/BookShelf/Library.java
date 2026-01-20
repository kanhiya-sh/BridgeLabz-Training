package BridgeLabz_Day28_ScenarioBased.BookShelf;

import java.util.*;
class Library {
    HashMap<String, LinkedList<String>> genreMap = new HashMap<>();
    HashSet<String> bookSet = new HashSet<>();
    void addBook(String genre, String book) {
        if (bookSet.contains(book)) {
            return;
        }
        if (!genreMap.containsKey(genre)) {
            genreMap.put(genre, new LinkedList<>());
        }
        genreMap.get(genre).add(book);
        bookSet.add(book);
    }

    void removeBook(String genre, String book) {
        if (!genreMap.containsKey(genre)) return;

        genreMap.get(genre).remove(book);
        bookSet.remove(book);
    }

    void displayLibrary() {
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (String book : genreMap.get(genre)) {
                System.out.println("  " + book);
            }
        }
    }
}
