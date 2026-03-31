package BridgeLabz_Day41_Scenario;

import java.util.*;

public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId) {
        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> results = new ArrayList<>();
        double maxSpeed = 0;
        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > maxSpeed) {
                maxSpeed = v.getAverageSpeed();
            }
        }
        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                results.add(v);
            }
        }
        return results;
    }
}