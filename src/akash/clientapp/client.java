package akash.clientapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class client {

    static final String DB_URL = "jdbc:mysql://localhost:3306/anudiphiber";
    static final String USER = "root";
    static final String PASS = "Ayush_2006";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Client_Master";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                int clientNo = rs.getInt("ClientNo");
                String name = rs.getString("Name");
                String address1 = rs.getString("Address1");
                String address2 = rs.getString("Address2");
                String city = rs.getString("City");
                String pincode = rs.getString("Pincode");
                String state = rs.getString("State");
                double balDue = rs.getDouble("BalDue");

                // Display values
                System.out.print("ClientNo: " + clientNo);
                System.out.print(", Name: " + name);
                System.out.print(", Address1: " + address1);
                System.out.print(", Address2: " + address2);
                System.out.print(", City: " + city);
                System.out.print(", Pincode: " + pincode);
                System.out.print(", State: " + state);
                System.out.println(", BalDue: " + balDue);
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
