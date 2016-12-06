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
    
    public Database() {
                
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
    
    public void createStatement(String SQL) {
        
        try {
            
            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()) {
                
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String user = rs.getString("username");
                String pass = rs.getString("password");
                String company = rs.getString("company");
                double salary = rs.getDouble("salary");
                double hours = rs.getDouble("hours");

                System.out.println(name + " " + age + " " + address + " " +
                        email + " " + user + " " + pass + " " + company + " " + 
                        salary + " " + hours);            
                
            }
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
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