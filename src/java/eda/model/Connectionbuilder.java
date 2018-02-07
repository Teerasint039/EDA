/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda.model;

import java.sql.*;

/**
 *
 * @author int105
 */
public class Connectionbuilder {
    public static int count=0;

    public static Connection connect() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/int206_spm?zeroDateTimeBehavior=convertToNull";
        String driver = "com.mysql.jdbc.Driver";
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            
            System.out.println("connected");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }

}
