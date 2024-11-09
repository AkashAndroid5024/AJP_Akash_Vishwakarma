package akash.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCustomerData {

    static final String DB_URL = "jdbc:mysql://localhost:3306/anudiphiber";
    static final String USER = "root";
    static final String PASS = "Ayush_2006";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Prepare the SQL statement for deletion
            String sql = "DELETE FROM Customer WHERE customer_id = ?";
            pstmt = conn.prepareStatement(sql);

            // Get customer ID to delete
            System.out.print("Enter Customer ID to delete: ");
            int customerId = scanner.nextInt();

            // Set the parameter
            pstmt.setInt(1, customerId);

            // Execute the delete operation
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Customer data deleted successfully!");
            } else {
                System.out.println("No customer found with the given ID.");
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                scanner.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

