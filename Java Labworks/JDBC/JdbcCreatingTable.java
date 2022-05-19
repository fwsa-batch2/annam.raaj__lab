package com.JavaBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreatingTable {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/School_jdbc_java";
        String User_name ="pavan";
        String password ="pavan@06";
        //Create db
        try{
            Connection connt = DriverManager.getConnection(URL,User_name,password);
            String sql="CREATE TABLE Teacher(id INT PRIMARY KEY, Name VARCHAR(50) NOT NULL, Subject VARCHAR(30) NOT NULL)";
            Statement stmt = connt.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successful");
        }
        catch (SQLException e){
            System.out.println("not created");
            e.printStackTrace();
        }
    }
}
