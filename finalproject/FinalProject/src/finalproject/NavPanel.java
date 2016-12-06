package finalproject;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkc5101
 */
public class NavPanel extends JPanel {
    
    public JButton optionsButton;
    public JButton instructionsButton;
    public JButton creditsButton;
    public JButton homeButton;
    public JButton profileButton;
    public JButton payrollButton;
    public JButton loginButton;
    public JButton logoffButton;
    
    public NavPanel() {
        
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
        homeButton = new JButton("Home");
        profileButton = new JButton("Profile");
        payrollButton = new JButton("Payroll");
        loginButton = new JButton("Login");
        logoffButton = new JButton("Logoff");
        
        add(loginButton);
        add(homeButton);
        add(profileButton);
        add(payrollButton);
        add(instructionsButton);
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);
        add(logoffButton);
        
    }

}
