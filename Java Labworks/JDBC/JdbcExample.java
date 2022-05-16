package com.JavaBasics;
import java.sql.*;
import java.sql.Connection;

public class JdbcExample {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/School_jdbc_java";
        String User_name ="pavan";
        String password ="pavan@06";
        //Create db
//        try{
//            Connection connt = DriverManager.getConnection(URL,User_name,password);
//            String sql="CREATE DATABASE JDBC";
//            Statement stmt = connt.createStatement();
//            stmt.executeUpdate(sql);
//            System.out.println("Successful1");
//        }
//        catch (SQLException e){
//            System.out.println("not created1");
//            e.printStackTrace();
     //   }
        //Drop db
//        try{
//            Connection connt = DriverManager.getConnection(URL,User_name,password);
//            String sql="DROP DATABASE JDBC";
//            Statement stmt = connt.createStatement();
//            stmt.executeUpdate(sql);
//            System.out.println("Successful2");
//        }
//        catch (SQLException e){
//            System.out.println("not created2");
//            e.printStackTrace();
//        }
        // create new db
//        try{
//            Connection connt = DriverManager.getConnection(URL,User_name,password);
//            String sql="CREATE DATABASE School_jdbc_java";
//            Statement stmt = connt.createStatement();
//            stmt.executeUpdate(sql);
//            System.out.println("Successful3");
//        }
//        catch (SQLException e){
//            System.out.println("not created3");
//            e.printStackTrace();
//        }
        //new table
        try{
            Connection connt = DriverManager.getConnection(URL,User_name,password);
            String sql="CREATE TABLE Teacher(id INT PRIMARY KEY, Name VARCHAR(30) NOT NULL, Subject VARCHAR(20) NOT NULL UNIQUE)";
            Statement stmt = connt.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Successful4");
        }
        catch (SQLException e){
            System.out.println("not created4");
            e.printStackTrace();
        }


    }
}
