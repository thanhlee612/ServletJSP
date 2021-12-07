package com.laptrinhjava.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/hellostudent";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
}
