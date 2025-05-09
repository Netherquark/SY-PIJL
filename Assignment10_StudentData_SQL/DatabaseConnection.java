import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class for establishing a connection to the MySQL database.
 */
public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "foodonthesqltable";
        return DriverManager.getConnection(url, user, password);
    }
}

