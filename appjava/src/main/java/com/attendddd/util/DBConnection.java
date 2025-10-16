package com.attendddd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/attendance_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // your MySQL username
    private static final String PASS = "your_password"; // your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }


}
