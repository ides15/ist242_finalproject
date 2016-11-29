/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSlider;
/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsPanel extends JPanel {
    
    private JLabel options;
    private JTextField backgroundColor;
    private JSlider fontSize;
    
    public OptionsPanel() {
        
        backgroundColor = new JTextField("Set the background color");
        
        options = new JLabel("Choose the font size");
        
        fontSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        fontSize.setMajorTickSpacing(1);
        fontSize.setPaintLabels(true);
        fontSize.setPaintTicks(true);        
        
        add(backgroundColor);
        add(options);
        add(fontSize);
                
    }
    
    public int getFontSize() {
        
        return fontSize.getValue();
        
    }
    
}