package BridgeLabz_Day41_Scenario;

import java.util.List;
import java.util.Scanner;

public class OceanFleet {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        VesselUtil util = new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(myScan.nextLine());
        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {
            String input = myScan.nextLine();
            String[] arr = input.split(":");
            Vessel vessel = new Vessel(
                    arr[0],
                    arr[1],
                    Double.parseDouble(arr[2]),
                    arr[3]
            );
            util.addVesselPerformance(vessel);
        }
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = myScan.nextLine();
        Vessel ves = util.getVesselById(searchId);
        if (ves != null) {
            System.out.println(
                    ves.getVesselId() + " | " +
                    ves.getVesselName() + " | " +
                    ves.getVesselType() + " | " +
                    ves.getAverageSpeed() + " knots"
            );
        }
        else {
            System.out.println("Vessel Id " + searchId + " not found");
        }
        System.out.println("High performance vessels are");
        List<Vessel> ll = util.getHighPerformanceVessels();
        for (Vessel hv : ll) {
            System.out.println(
                    hv.getVesselId() + " | " +
                    hv.getVesselName() + " | " +
                    hv.getVesselType() + " | " +
                    hv.getAverageSpeed() + " knots"
            );
        }
    }
}