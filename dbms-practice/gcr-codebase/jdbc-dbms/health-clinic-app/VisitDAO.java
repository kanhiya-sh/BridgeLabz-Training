package BridgeLabz_Day43_DBMS;

import java.sql.*;
import java.util.Scanner;

public class VisitDAO {
    public static void recordVisit(Scanner myScan) {
        try {
            Connection conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            System.out.println("Enter Appointment ID : ");
            int aid = myScan.nextInt();
            myScan.nextLine();

            System.out.println("Enter Diagnosis : ");
            String diagnosis = myScan.nextLine();

            System.out.println("Enter Notes : ");
            String notes = myScan.nextLine();

            String visitSql = "INSERT INTO visits(appointment_id,diagnosis,notes) VALUES(?,?,?)";
            PreparedStatement ps1 = conn.prepareStatement(visitSql);
            ps1.setInt(1, aid);
            ps1.setString(2, diagnosis);
            ps1.setString(3, notes);
            ps1.executeUpdate();

            String updateSql = "UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?";
            PreparedStatement ps2 = conn.prepareStatement(updateSql);
            ps2.setInt(1, aid);
            ps2.executeUpdate();

            conn.commit();
            System.out.println("Visit Recorded Successfully");

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
