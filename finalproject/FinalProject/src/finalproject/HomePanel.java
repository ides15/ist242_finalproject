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
        
        optionsLabel = new JLabel("Font size: ");
        add(optionsLabel);
        optionsLabel.setBounds(230, 100, 200, 50);
        
    }
    
}
