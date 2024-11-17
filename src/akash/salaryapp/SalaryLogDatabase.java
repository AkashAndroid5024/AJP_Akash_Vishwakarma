package akash.salaryapp;
import java.sql.*;
import java.util.Scanner;

public class SalaryLogDatabase {
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

            // 2. Create the Salary_Log table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Salary_Log ("
                    + "log_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "employee_id INT, "
                    + "new_salary DECIMAL(10, 2), "
                    + "change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Salary_Log table created successfully.");

            String dropTriggerSQL = "DROP TRIGGER IF EXISTS before_insert_salary_log";
            stmt.executeUpdate(dropTriggerSQL);
            System.out.println("Existing trigger 'before_insert_salary_log' dropped (if it existed).");

            // 3. Create the trigger to prevent salary insertion <= 0
            String createTriggerSQL = "CREATE TRIGGER before_insert_salary_log "
                    + "BEFORE INSERT ON Salary_Log "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "    IF NEW.new_salary <= 0 THEN "
                    + "        SIGNAL SQLSTATE '45000' "
                    + "        SET MESSAGE_TEXT = 'Salary must be greater than zero. Insertion aborted.'; "
                    + "    END IF; "
                    + "END";
            stmt.executeUpdate(createTriggerSQL);
            System.out.println("Trigger 'before_insert_salary_log' created successfully.");

            // 4. Ask user for employee_id and new_salary
            System.out.print("Enter employee ID: ");
            int employeeId = scanner.nextInt();
            System.out.print("Enter new salary: ");
            double newSalary = scanner.nextDouble();

            // 5. Insert a new record into the Salary_Log table with user input
            String insertSQL = "INSERT INTO Salary_Log (employee_id, new_salary) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, employeeId);
            pstmt.setDouble(2, newSalary);

            try {
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("New salary record inserted successfully.");
                }
            } catch (SQLException e) {
                // Catch the custom exception raised by the trigger
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
