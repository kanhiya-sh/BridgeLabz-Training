

public class VolumeOfEarthInCubicKmAndCubicMiles {
    public static void main(String[] args) {
        double radius = 6378; // radius of the Earth in kilometers
        double volumeInCubicKm = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
        double volumeInCubicMiles = volumeInCubicKm * 0.239912; // conversion factor from cubic kilometers to cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKm + " and cubic miles is " + volumeInCubicMiles) ;
    }
}
