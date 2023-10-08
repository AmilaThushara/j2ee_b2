/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author REDTECH
 */
public class DB {
    
    private static Connection connection;
    
    public static void setUp() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/j2web1", "root", "");
    }
    
    public static void fetch(String sql)throws SQLException, ClassNotFoundException{
       if (connection == null)  {
           setUp();
       } 
       connection.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql)throws SQLException, ClassNotFoundException{
        if (connection == null)  {
            setUp();
        }
        return connection.createStatement().executeQuery(sql);
    } 
    
     public static Connection getConnection()throws SQLException, ClassNotFoundException{
        if (connection == null)  {
            setUp();
        }
        return connection;
    } 
}
