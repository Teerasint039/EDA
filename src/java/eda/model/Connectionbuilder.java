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

    public static Connection connect() throws ClassNotFoundException, SQLException {
        final String host = "jdbc:mysql://localhost:3306/MySQLAgileCamp";
        final String uName = "root";
        final String uPass = "?????????";
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        System.out.println("Connection created");
        count++;
        System.out.println(count);
        return con;
    }

}
