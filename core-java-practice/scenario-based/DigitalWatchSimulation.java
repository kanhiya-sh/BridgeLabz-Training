package scenarioBased;

public class DigitalWatchSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (hour == 13 && minute == 0) {
                    System.out.println("Watch stopped at 13:00");
                    break;
                }
//                now for always printing 2 digits
                String h = (hour < 10) ? "0" + hour : "" + hour;
                String m = (minute < 10) ? "0" + minute : "" + minute;
                System.out.println(h + ":" + m);            }

            if (hour == 13) {
                break;
            }
        }
	}

}
