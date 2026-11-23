package com.university;

import java.sql.Connection; // Imports the Connection interface

import java.sql.DriverManager; // Imports the DriverManager class to establish connections

import java.sql.SQLException; // Imports SQLException to handle database errors

// This class handles the connection to the database

public class DatabaseUtil {
// The URL of the database. "university_db" is the name we created in Phase 1

    private static final String URL = "jdbc:mysql://localhost:3306/university_db";

    // Dedicated MySQL account for this application

    private static final String USER = "sumeya_app";

    // Local development password (do not publish real credentials)

    private static final String PASSWORD = "Campus@2026!";

    // This method returns a Connection object. It throws SQLException if it fails.

    public static Connection getConnection() throws SQLException {

    // DriverManager attempts to connect to the database using the URL, USER, and PASSWORD

         return DriverManager.getConnection(URL, USER, PASSWORD);

    }

}
