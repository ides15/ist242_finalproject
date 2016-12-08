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

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class LoginPanel extends JPanel implements ActionListener {
    
    private Database db;
    
    private JLabel usernameLabel, passwordLabel;
    public JLabel resultLabel;
    public JTextField usernameTextField, passwordTextField;
    private JButton createUserButton, submitButton;
    
    public Person user;
    
    public LoginPanel(Database db) {
        
        this.db = db;
        
        setLayout(null);
        
        resultLabel = new JLabel();
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameTextField = new JTextField();
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
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton event = (JButton)e.getSource();
        
        if(event == createUserButton) {
            
            System.out.println("create user");
            
        }
        
        if(event == submitButton) {
            
            String verify = "select password from Person where username = '" 
                    + usernameTextField.getText() + "'";
            
            if(db.checkVerification(verify, "password").equals(passwordTextField.getText())) {    // if username matches password
                
                resultLabel.setText("Login verified.");
                add(resultLabel);
                resultLabel.setBounds(350, 350, 300, 30);
                db.setVerified(true);
                
                user = new Person(db);
                user.setUsername(usernameTextField.getText());
                                                
            }
            
            else {
                
                resultLabel.setText("Incorrect username or password, please try again.");
                add(resultLabel);
                resultLabel.setBounds(350, 350, 300, 30);
                db.setVerified(false);
                                                
            }
                        
        }
        
    }
    
}
