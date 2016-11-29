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
    
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;
    JButton homeButton;
    JButton profileButton;
    JButton payrollButton;
    JButton logoffButton;
    
    NavPanel() {
        
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
        homeButton = new JButton("Home");
        profileButton = new JButton("Profile");
        payrollButton = new JButton("Payroll");
        logoffButton = new JButton("Logoff");
        
        add(homeButton);
        add(profileButton);
        add(payrollButton);
        add(instructionsButton);
        add(optionsButton);
        add(instructionsButton);
        add(logoffButton);
        
    }

}
