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
    
    private JLabel test;
    private JLabel optionsLabel;
    
    public HomePanel() {
        
        setLayout(null);
        
        test = new JLabel("Home");
        add(test);
        test.setBounds(275, 10, 100, 100);
        
        // if
        optionsLabel = new JLabel("No options selected.");
        add(optionsLabel);
        optionsLabel.setBounds(200, 100, 300, 50);
        
    }
    
}
