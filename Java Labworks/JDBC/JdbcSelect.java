package com.JavaBasics;

import javax.xml.transform.Result;
import java.sql.*;

public class JdbcSelect {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/School_jdbc_java";
        String User_name ="pavan";
        String password ="pavan@06";

        Connection con= DriverManager.getConnection(URL,User_name,password);
        String sql = "SELECT * FROM Teacher";
        PreparedStatement smt = con.prepareStatement(sql);
        ResultSet res= smt.executeQuery();
        while (res.next()){
            int col1=res.getInt(1);
            String col2=res.getString(2);
            String col3=res.getString(3);
            System.out.println("id: "+col1+", Name: "+col2+", Subject: "+col3);
        }
        System.out.println("Query Executed");
    }
}
