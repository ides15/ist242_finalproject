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
    
    private JLabel instructions;
    
    public InstructionsPanel() {
        
        instructions = new JLabel("These are instructions for this payroll "
                + "system.");
        
        add(instructions);
        
    }
    
}
