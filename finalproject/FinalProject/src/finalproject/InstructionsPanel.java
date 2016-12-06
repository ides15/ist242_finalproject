/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class InstructionsPanel extends JPanel {
    
    private JLabel instructionsLabel;
    
    public InstructionsPanel() {
        
        setLayout(null);
        
        instructionsLabel = new JLabel("<html>Instructions: "
                + "<br><br>The login button will take you to the login page."
                + "<br>The options button will give you the options that you can"
                + "visually change."
                + "<br>The instructions button will take you to this page."
                + "<br>The home button will take you back to the home page."
                + "<br>The profile button will give you the ability to edit your"
                + "profile information."
                + "<br>The payroll button will allow you to change the payroll"
                + "features like salary."
                + "<br>The credits button will tell you a bit about the "
                + "developers of the application."
                + "<br>The logoff button will allow you to log out of the "
                + "system.</html>");
        
        add(instructionsLabel);
        instructionsLabel.setBounds(250, 100, 500, 300);
        
    }
    
}
