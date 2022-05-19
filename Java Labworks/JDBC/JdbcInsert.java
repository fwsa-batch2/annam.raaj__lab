package com.JavaBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/School_jdbc_java";
        String User_name ="pavan";
        String password ="pavan@06";

        Connection connect= DriverManager.getConnection(URL,User_name,password);
        String sql="INSERT INTO Teacher VALUES(1,'Chitra','Tech'),(2,'Revathi','ELS'),(3,'Surya','Tech'),(4,'Lisha','ELS'),(5,'Shyam','Principal')";
        PreparedStatement stmt= connect.prepareStatement(sql);
        stmt.executeUpdate();
        System.out.println("Values Got Inserted.");
    }
}
