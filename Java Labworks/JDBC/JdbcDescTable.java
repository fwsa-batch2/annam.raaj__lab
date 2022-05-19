package com.JavaBasics;
import java.sql.*;
public class JdbcDescTable {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/School_jdbc_java";
        String User_name ="pavan";
        String password ="pavan@06";
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(URL,User_name,password);
            String sql="DESC Teacher";
            Statement stmt=connection.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            while(result.next()) {
                String column1 = result.getString(1);
                String column2 = result.getString(2);
                String column3 = result.getString(3);
                String column4 = result.getString(4);
                String column5 = result.getString(5);
                String column6 = result.getString(6);
                System.out.println("Field : " +column1+", Type : "+column2 +", Null : " +column3+ ", Key : "+column4+", Default : "+column5+ ", Extra :" +column6);
            }
            System.out.println("Table created...");
        } catch (Exception e) {
            System.out.println("Not created..");
            e.printStackTrace();
        }
    }
}
