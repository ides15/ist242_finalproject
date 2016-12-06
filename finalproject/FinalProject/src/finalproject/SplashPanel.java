/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class SplashPanel extends JPanel implements ActionListener {
    
    private JButton splashPictureButton;
    private JButton loginButton;
    
    public SplashPanel() {
        
        setLayout(null);
        
        splashPictureButton = new JButton(new ImageIcon("src/images/dollareyes.png"));
        add(splashPictureButton);
        splashPictureButton.setBounds(125, 50, 350, 350);
                
        loginButton = new JButton("Login");
        add(loginButton);
        loginButton.setBounds(250, 465, 100, 30);
        loginButton.addActionListener(this);
                
        try {
            
            String host = "jdbc:derby://localhost:1527/Person";
            String username = "root";
            String password = "MV%G!Sg^W2Kh2GA";

            Connection con = DriverManager.getConnection(host, username, password);
      
            Statement stmt = con.createStatement();
            String SQL = "select * from Person";
        }
        
        catch(SQLException err) {
            
            System.out.println(err.getMessage());
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }
    

    
}
