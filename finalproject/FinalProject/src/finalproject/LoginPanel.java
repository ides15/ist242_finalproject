/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class LoginPanel extends JPanel implements ActionListener {
    
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameTextField, passwordTextField;
    private JButton createUserButton, submitButton;
    
    public LoginPanel() {
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameTextField = new JTextField();
        passwordTextField = new JTextField();
        
        createUserButton = new JButton("Create User");
        submitButton = new JButton("Submit");
        
        GridLayout grid = new GridLayout(3, 3, 100, 100);
        setLayout(grid);
        
        add(usernameLabel);
        add(usernameTextField);
        add(passwordLabel);
        add(passwordTextField);
        add(createUserButton);
        add(submitButton);
        
        createUserButton.addActionListener(this);
        submitButton.addActionListener(this);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }
    
    
    
}
