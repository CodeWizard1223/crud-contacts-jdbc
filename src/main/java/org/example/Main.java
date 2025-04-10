package org.example;

import org.example.db.DBContactService;
import org.example.db.HikariCPDataSource;
import org.example.service.CRUDManager;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        new CRUDManager().printOptions();
//        DBContactService contactService = new DBContactService();
//        contactService.readAll().forEach(System.out::println);

//        String select = "SELECT * FROM contact";
//        // String connectionUrl = "jdbc:mysql://localhost:3306/contacts";
//
//        try (Connection conn = HikariCPDataSource.getConnection();
//             PreparedStatement ps = conn.prepareStatement(select);
//             ResultSet rs = ps.executeQuery()){
//            // not valid form of connection, we can not create connection like this
//            // try with resources!
//            // Connection conn = DriverManager.getConnection(connectionUrl, "root", "Sestrabc594");
//            // place where we can write commands
//            // PreparedStatement ps = conn.prepareStatement(select);
//            // need to run program; interface wrapper to get results from database
//            // ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                long id = rs.getLong("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                String phoneNumber = rs.getString("phone");
//
//                System.out.println("id: " + id + ", name: " + name + ", email: " + email + ", phone number: " + phoneNumber);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Error while connecting to database!");
//        }


    }
}