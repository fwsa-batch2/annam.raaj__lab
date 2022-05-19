package com.JavaBasics;
import java.sql.*;
import java.sql.Connection;

public class JdbcCreatingDb {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String User_name ="pavan";
        String password ="pavan@06";
        //Create db
        try{
            Connection connt = DriverManager.getConnection(URL,User_name,password);
            String sql="CREATE DATABASE School_jdbc_java";
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
