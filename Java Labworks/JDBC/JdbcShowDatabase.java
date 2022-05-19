package com.JavaBasics;

import java.sql.*;

public class JdbcShowDatabase {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String User_name ="pavan";
        String password ="pavan@06";
        //Create db
        try{
            Connection connt = DriverManager.getConnection(URL,User_name,password);
            String sql="SHOW DATABASES";
            PreparedStatement stmt = connt.prepareStatement(sql);
            ResultSet result =stmt.executeQuery(sql);
            System.out.println("Successful");
            System.out.println("List of databases: ");
            while(result.next()) {
                System.out.print(result.getString(1));
                System.out.println();
            }
        }
        catch (SQLException e){
            System.out.println("not created");
            e.printStackTrace();
        }

    }
}
