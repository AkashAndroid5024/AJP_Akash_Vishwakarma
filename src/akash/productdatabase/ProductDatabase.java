package akash.productdatabase;
import java.sql.*;
import java.util.Scanner;

public class ProductDatabase {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/ajp";  // replace with your database name
        String username = "root";  // replace with your database username
        String password = "Ayush_2006";  // replace with your database password

        Connection conn = null;
        Statement stmt = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Establish the database connection
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            // 2. Drop the trigger if it already exists
            String dropTriggerSQL = "DROP TRIGGER IF EXISTS after_insert_product_metadata";
            stmt.executeUpdate(dropTriggerSQL);
            System.out.println("Existing trigger 'after_insert_product_metadata' dropped (if it existed).");

            // 3. Create the trigger to insert into Product_Metadata after inserting into products
            String createTriggerSQL = "CREATE TRIGGER after_insert_product_metadata "
                    + "AFTER INSERT ON products "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "    IF NOT EXISTS (SELECT 1 FROM Product_Metadata WHERE product_id = NEW.product_id) THEN "
                    + "        INSERT INTO Product_Metadata (product_id) "
                    + "        VALUES (NEW.product_id); "
                    + "    END IF; "
                    + "END;";


            stmt.executeUpdate(createTriggerSQL);
            System.out.println("Trigger 'after_insert_product_metadata' created successfully.");

            // 4. Ask user for product details
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            // 5. Insert a new record into the products table with user input
            String insertProductSQL = "INSERT INTO products (product_name, price) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertProductSQL);
            pstmt.setString(1, productName);
            pstmt.setDouble(2, price);

            try {
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("New product record inserted successfully.");
                }
            } catch (SQLException e) {
                // Catch any errors (including trigger-related errors)
                System.out.println("Error: " + e.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                if (scanner != null) scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
