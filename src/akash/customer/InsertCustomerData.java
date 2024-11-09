package akash.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertCustomerData {

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

            // Prepare the SQL statement for insertion
            String sql = "INSERT INTO Customer (customer_id, first_name, last_name) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Get user input for customer data
            System.out.print("Enter Customer ID: ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            // Set the parameters
            pstmt.setInt(1, customerId);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);

            // Execute the insert operation
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Customer data inserted successfully!");
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
