/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class LoginPanel extends JPanel implements ActionListener {
    
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameTextField, passwordTextField;
    private JButton createUserButton, submitButton;
    
    public LoginPanel() {
        
        setLayout(null);
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameTextField = new JTextField("jdean0");
        passwordTextField = new JTextField();
        
        createUserButton = new JButton("Create User");
        submitButton = new JButton("Submit");
        
        add(usernameLabel);
        usernameLabel.setBounds(350, 200, 150, 30);
        
        add(usernameTextField);
        usernameTextField.setBounds(450, 200, 200, 30);
        
        add(passwordLabel);
        passwordLabel.setBounds(350, 250, 150, 30);
        
        add(passwordTextField);
        passwordTextField.setBounds(450, 250, 200, 30);
        
        add(createUserButton);
        createUserButton.setBounds(350, 300, 120, 30);
        
        add(submitButton);
        submitButton.setBounds(550, 300, 100, 30);
        
        createUserButton.addActionListener(this);
        submitButton.addActionListener(this);
                
        try {
            
            String db_host = "jdbc:derby://localhost:1527/Person";
            String db_username = "root";
            String db_password = "MV%G!Sg^W2Kh2GA";

            Connection con = DriverManager.getConnection(db_host, db_username, db_password);
      
            Statement stmt = con.createStatement();
            String SQL = "select password from Person where username = '" + usernameTextField.getText() + "'";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
            String test_password = rs.getString("password");
            
            System.out.println("Username: " + usernameTextField.getText() + ", password: " + test_password);
            
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
            
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }
    
}
