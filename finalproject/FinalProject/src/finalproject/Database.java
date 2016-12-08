/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class Database {
    
    public Connection con;
    
    public boolean verified;
    
    public Database() {
        
        verified = false;
                
        try {
            
            String db_host = "jdbc:derby://localhost:1527/Person";
            String db_username = "root";
            String db_password = "MV%G!Sg^W2Kh2GA";

            con = DriverManager.getConnection(db_host, db_username, db_password);
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }
    
    public String checkVerification(String SQL, String column) {
        
        try {
            
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String result = rs.getString(column);
            
            return result;
            
        }
        
        catch(SQLException err) {
            
            return err.getMessage();
            
        }
        
    }
    
    public void updateUser(String username, String name, int age, 
                           String address, String email, String password) {
        
        try {
            
            String SQL = "update Person "
                       + "set name = '" + name + "', age = '" + age + "', "
                       + "address = '" + address + "', email = '" + email + "', "
                       + "password = '" + password + "' where username = '" + username + "'";
            
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(SQL);
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }
    
    public String getUser(String username) {
        
        try {
            
            String SQL = "select username from Person where username = '" + username + "'";
            
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String user = rs.getString("username");
            
            System.out.println("Username from db: " + user);
            return user;
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public void setVerified(boolean verified) {
        
        this.verified = verified;
        
    }
    
}