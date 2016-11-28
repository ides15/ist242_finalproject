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
 * @author wfx5003
 */
public class InstructionsPanel extends JPanel {
    
    JLabel instructionsLabel;
    
    public InstructionsPanel() {
        
        instructionsLabel = new JLabel("This is testing the instructions panel.");
        add(instructionsLabel);
        
    }
    
}
