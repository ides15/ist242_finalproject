/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    public String user = null;
    public String pass = null;
    public String person = null;
    
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
    
    public void setPerson(String username) {
        
        this.person = username;
        
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
    
    public void setPass(String password) {
        
        this.pass = password;
        
    }
    
    public void createNewUser(String SQL) {
        
        try {
            
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.executeUpdate();
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }
    
    public String getPass(String pass_word) {
        
        try {
            
            setPass(pass_word);
            
            String SQL = "select password from Person where password = '" + this.pass + "'";
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String pass_string = rs.getString("password");
            
            return pass;
                    
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public void setUser(String username) {

        this.user = username;
        
    }
    
    public String getUser(String user_name) {
        
        try {
            
            setUser(user_name); //sorry for the awful variable names, I'm tired
            
            String SQL = "select username from Person where username = '" + this.user + "'";
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String user_string = rs.getString("username");
            
            return user;
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public String getAddress(String username) {
        
        try {
            
            String SQL = "select address from Person where username = '" + username + "'";
        
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String address = rs.getString("address");
            
            return address;
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public String getEmail(String username) {
        
        try {
            
            String SQL = "select email from Person where username = '" + username + "'";
        
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String email = rs.getString("email");
            
            return email;
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public String getName(String username) {
        
        try {
            
            String SQL = "select name from Person where username = '" + username + "'";
        
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String name = rs.getString("name");
            
            return name;
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            return "";
            
        }
        
    }
    
    public String getAge(String username) {
        
        try {
            
            String SQL = "select age from Person where username = '" + username + "'";
        
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String age = rs.getString("age").toString();
            
            return age;
            
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