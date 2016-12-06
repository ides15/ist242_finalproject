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
public class HomePanel extends JPanel {
    
    public JLabel optionsLabel;
    
    public HomePanel() {
        
        setLayout(null);
        
        optionsLabel = new JLabel("No options selected.");
        add(optionsLabel);
        optionsLabel.setBounds(250, 50, 500, 50);
        
    }
    
}
