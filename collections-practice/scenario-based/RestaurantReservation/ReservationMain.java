package BridgeLabz_Day33_ScenarioBased.RestaurantReservation;

public class ReservationMain {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        try {
            res.reserveTable(1, "7PM");
            res.reserveTable(2, "8PM");
            res.reserveTable(1, "7PM"); // double booking
        }
        catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }
        res.showAvailableTables("7PM");
        res.cancelReservation(1, "7PM");
        res.showAvailableTables("7PM");
    }
}
