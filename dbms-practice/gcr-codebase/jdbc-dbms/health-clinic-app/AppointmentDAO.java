package BridgeLabz_Day43_DBMS;

import java.sql.*;
import java.util.Scanner;

public class AppointmentDAO {

    public static void bookAppointment(Scanner myScan) {
        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Enter Patient ID : ");
            int pid = myScan.nextInt();

            System.out.println("Enter Doctor ID : ");
            int did = myScan.nextInt();

            System.out.println("Enter Date (yyyy-mm-dd) : ");
            myScan.nextLine();
            String date = myScan.nextLine();

            System.out.println("Enter Time (hh:mm:ss) : ");
            String time = myScan.nextLine();

            String sql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?, 'SCHEDULED')";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, pid);
            ps.setInt(2, did);
            ps.setDate(3, Date.valueOf(date));
            ps.setTime(4, Time.valueOf(time));

            ps.executeUpdate();
            System.out.println("Appointment Booked");

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
