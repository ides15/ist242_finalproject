/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class SplashPanel extends JPanel {
    JButton splashPictureButton;
    JButton loginButton;
        
    JLabel optionsLabel;
    
    SplashPanel() {
        setLayout(null);
        
        splashPictureButton = new JButton(new ImageIcon("src/images/dollareyes.png"));
        add(splashPictureButton);
        splashPictureButton.setBounds(125, 50, 350, 350);
        
        optionsLabel = new JLabel("No options selected.");
        add(optionsLabel);
        optionsLabel.setBounds(250, 400, 200, 50);
        
        loginButton = new JButton("Login");
        add(loginButton);
        loginButton.setBounds(250, 465, 100, 30);
    }
}
