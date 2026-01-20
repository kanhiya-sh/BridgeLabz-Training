package BridgeLabz_Day28_ScenarioBased.CinemaTime;

import java.util.ArrayList;
import java.util.List;

class MovieManager {
    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();
    void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid Time Format");
        }
        titles.add(title);
        times.add(time);
        System.out.println("Movie Added");
    }
    void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).contains(keyword)) {
                    System.out.println(titles.get(i) + " at " + times.get(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No Movie Found");
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Search Index Error");
        }
    }
    void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i) + " - " + times.get(i));
        }
    }
    void printReport() {
        String[] report = titles.toArray(new String[0]);
        System.out.println("Movie Report:");
        for (String movie : report) {
            System.out.println(movie);
        }
    }
    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")){
            return false;
        }
        int hh = Integer.parseInt(time.substring(0, 2));
        int mm = Integer.parseInt(time.substring(3, 5));
        return hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59;
    }
}
class InvalidTimeFormatException extends Exception {
    InvalidTimeFormatException(String msg) {
        super(msg);
    }
}
