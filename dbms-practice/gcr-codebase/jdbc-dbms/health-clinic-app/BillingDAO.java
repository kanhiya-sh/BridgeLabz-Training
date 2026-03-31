package BridgeLabz_Day43_DBMS;

import java.sql.*;
import java.util.Scanner;

public class BillingDAO {
    public static void generateBill(Scanner myScan) {
        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Enter Visit ID : ");
            int vId = myScan.nextInt();

            System.out.println("Enter Total Amount : ");
            double amount = myScan.nextDouble();

            String sql = "INSERT INTO bills(visit_id,total_amount,payment_status) VALUES(?,?,'UNPAID')";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, vId);
            ps.setDouble(2, amount);

            ps.executeUpdate();
            System.out.println("Bill Generated");

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
