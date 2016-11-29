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
    private JTextField backgroundcolor;
    private JSlider fontsize;
    public OptionsPanel() {
        
        
       backgroundcolor = new JTextField("--Set the Background Color--");
       options = new JLabel("Choose the font size");
       fontsize = new JSlider(JSlider.HORIZONTAL, 1,10,5);
       fontsize.setMajorTickSpacing(1);
       fontsize.setPaintLabels(true);
       fontsize.setPaintTicks(true);
        
        add(backgroundcolor);
        add(options);
        add(fontsize);
        
    }
    
}