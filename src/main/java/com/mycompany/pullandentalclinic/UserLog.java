package com.mycompany.pullandentalclinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class UserLog {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void logAction(int userId, String action, String details) {
        String query = "INSERT INTO user_logs (user_id, action, timestamp, details) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            stmt.setString(2, action);
            stmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            stmt.setString(4, details);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
