package com.attendddd;

import com.attendddd.util.DBConnection;
import java.sql.Connection;

public class TestDB {
     public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("Connected to MySQL successfully!");
        } catch (Exception e) {
            e.printStackTrace();//vvv
            
        }
    }   
}
