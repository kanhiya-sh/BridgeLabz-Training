package BridgeLabz_Day29_Generics.ResumeScreening;

import java.util.*;
public class ResumeMain {
    public static void main(String[] args) {
        List<JobRole> rolesList = new ArrayList<>();
        rolesList.add(new SoftwareEngineer());
        rolesList.add(new DataScientist());
        screen(rolesList);
    }
    public static void screen(List<? extends JobRole> ll) {
        for (JobRole j : ll) {
            j.show();
        }
    }
}