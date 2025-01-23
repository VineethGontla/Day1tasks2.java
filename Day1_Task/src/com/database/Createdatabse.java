
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabse {
    // Create database
    public static void main(String[] args) {
        // MySQL connection URL, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/"; // No database name here, for creating a new one
        String username = "root";  // Ensure this is correct
        String password = "12345";  // Ensure this is correct

        // SQL query to create the database
        String sql = "CREATE DATABASE student3";

        try {
            // Register the JDBC driver (for MySQL 8+)
            Class.forName("com.mysql.cj.jdbc.Driver"); // Use the new driver class for MySQL Connector/J 8+

            // Establish the connection
            try (Connection con = DriverManager.getConnection(, "root", "12345");
                 Statement stmt = con.createStatement()) {

                // Execute the SQL statement
                stmt.executeUpdate(sql);
                System.out.println("Database created successfully!");

            } catch (SQLException e) {
                System.err.println("SQL error: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

