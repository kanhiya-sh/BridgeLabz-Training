package BridgeLabz_Day43_DBMS;

import java.sql.*;
import java.util.Scanner;

public class PatientDAO {
    public static void registerPatient(Scanner myScan) {
        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Enter Patient Name : ");
            String name = myScan.nextLine();

            System.out.println("Enter DOB (yyyy-mm-dd) : ");
            String dob = myScan.nextLine();

            System.out.println("Enter Phone : ");
            String phone = myScan.nextLine();

            System.out.println("Enter Email : ");
            String email = myScan.nextLine();

            System.out.println("Enter Address : ");
            String address = myScan.nextLine();

            System.out.println("Enter Blood Group : ");
            String bg = myScan.nextLine();

            String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, dob);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.setString(6, bg);

            ps.executeUpdate();
            System.out.println("Patient Registered Successfully");

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
