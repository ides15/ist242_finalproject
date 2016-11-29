/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsPanel extends JPanel {
    
    private JLabel options;
    
    private JSlider textSizeSlider;
    
    public OptionsPanel() {
        
        options = new JLabel("options");
        add(options);
        
        textSizeSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        textSizeSlider.setMajorTickSpacing(1);
        textSizeSlider.setPaintLabels(true);
        textSizeSlider.setPaintTicks(true);
        add(textSizeSlider);
        
    }
    
}
