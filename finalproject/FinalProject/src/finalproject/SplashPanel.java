/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class SplashPanel extends JPanel implements ActionListener {
    
    private JButton splashPictureButton;
    
    public SplashPanel() {
        
        BorderLayout border = new BorderLayout();
        setLayout(border);
        
        splashPictureButton = new JButton(new ImageIcon("src/images/dollareyes.png"));
        add(splashPictureButton, BorderLayout.CENTER);
                
        try {
            
            String host = "jdbc:derby://localhost:1527/Person";
            String username = "root";
            String password = "MV%G!Sg^W2Kh2GA";

            Connection con = DriverManager.getConnection(host, username, password);
      
            Statement stmt = con.createStatement();
            String SQL = "select * from Person";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            rs.next();
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
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }
    
}
