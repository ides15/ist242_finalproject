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
    
    public void setUser(String username, Person person) {
        
        try {
            
            String SQL = "select * from Person where username = '" + username + "'";
            
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()) {
                
                String name = rs.getString("name");
                person.setName(name);
                                
                int age = rs.getInt("age");
                person.setAge(age);
                                
                String address = rs.getString("address");
                person.setAddress(address);
                                
                String email = rs.getString("email");
                person.setEmail(email);
                
                String user = rs.getString("username");
                person.setUsername(user);
                
                String pass = rs.getString("password");
                person.setPassword(pass);
                
                String company = rs.getString("company");
                person.setCompany(company);
                
                double salary = rs.getDouble("salary");
                person.setSalary(salary);
                
                double hours = rs.getDouble("hours");
                person.setHours(hours);
                                
            }
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }
    
    public void setVerified(boolean verified) {
        
        this.verified = verified;
        
    }
    
}

      
//            Statement stmt = con.createStatement();
//            String SQL = "select password from Person where username = '" + usernameTextField.getText() + "'";
//            
//            ResultSet rs = stmt.executeQuery(SQL);
//            
//            rs.next();
//            String test_password = rs.getString("password");
//            
//            System.out.println("Username: " + usernameTextField.getText() + ", password: " + test_password);
            
//            String SQL = "select * from Person";
//            
//            ResultSet rs = stmt.executeQuery(SQL);
//            
//            rs.next();
//            String name = rs.getString("name");
//            int age = rs.getInt("age");
//            String address = rs.getString("address");
//            String email = rs.getString("email");
//            String user = rs.getString("username");
//            String pass = rs.getString("password");
//            String company = rs.getString("company");
//            double salary = rs.getDouble("salary");
//            double hours = rs.getDouble("hours");
//
//            System.out.println(name + " " + age + " " + address + " " +
//                    email + " " + user + " " + pass + " " + company + " " + 
//                    salary + " " + hours);            