package BridgeLabz_Day43_DBMS;

import java.sql.*;
import java.util.Scanner;

public class DoctorDAO {
    public static void addDoctor(Scanner myScan) {
        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Enter Doctor Name : ");
            String name = myScan.nextLine();

            System.out.println("Enter Specialty ID : ");
            int spId = myScan.nextInt();

            System.out.println("Enter Contact : ");
            myScan.nextLine();
            String contact = myScan.nextLine();

            System.out.println("Enter Consultation Fee : ");
            double fee = myScan.nextDouble();

            String sql = "INSERT INTO doctors(name,specialty_id,contact,consultation_fee) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, spId);
            ps.setString(3, contact);
            ps.setDouble(4, fee);

            ps.executeUpdate();
            System.out.println("Doctor Added Successfully");

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
