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
    JLabel optionsLabel;
    
    SplashPanel() {
        splashPictureButton = new JButton(new ImageIcon("src/images/dollareyes.png"));
        add(splashPictureButton);
        
        optionsLabel = new JLabel("No options selected.");
        add(optionsLabel);
    }
}
