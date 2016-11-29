/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsView extends JPanel {
    
    private JLabel options;
    
    private JTextField backgroundColor;
    
    private JSlider fontSize;
    
    private JButton saveButton;
    private JButton returnButton;
    
    OptionsModel optionsModel;
    
    public OptionsView(OptionsModel optionsModel) {
        
        this.optionsModel = optionsModel;
        
        backgroundColor = new JTextField("Set the background color");
        
        options = new JLabel("Choose the font size");
        
        fontSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        fontSize.setMajorTickSpacing(1);
        fontSize.setPaintLabels(true);
        fontSize.setPaintTicks(true); 
        
        saveButton = new JButton("Save");
        returnButton = new JButton("Return");
        
        add(backgroundColor);
        add(options);
        add(fontSize);
        add(saveButton);
        add(returnButton);
        
    }
    
}
