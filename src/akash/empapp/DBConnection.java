package akash.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;

    public static Connection createDBConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/employeeDB";
            String username = "root";
            String password = "Ayush_2006";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

