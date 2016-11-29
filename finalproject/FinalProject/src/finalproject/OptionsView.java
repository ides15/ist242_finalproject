/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionListener;
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
    
    public JLabel fontSizeLabel;
    public JLabel pageSizeLabel;
    public JLabel summaryLabel;
    
    public JTextField backgroundColor;
    
    public JSlider fontSize;
    public JSlider pageSize;
    
    private JButton saveButton;
    private JButton returnButton;
    
    OptionsModel optionsModel;
    
    public OptionsView(OptionsModel optionsModel) {
        
        this.optionsModel = optionsModel;
        
        backgroundColor = new JTextField("Set the background color");
        
        fontSizeLabel = new JLabel("Choose the font size");
        
        pageSizeLabel = new JLabel("Choose the page size");
        
        fontSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        fontSize.setMajorTickSpacing(1);
        fontSize.setPaintLabels(true);
        fontSize.setPaintTicks(true); 
        
        pageSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        pageSize.setMajorTickSpacing(1);
        pageSize.setPaintLabels(true);
        pageSize.setPaintTicks(true);
        
        saveButton = new JButton("Save");
        returnButton = new JButton("Return");
        
        summaryLabel = new JLabel("summary");
        
        add(backgroundColor);
        add(fontSizeLabel);
        add(fontSize);
        add(pageSizeLabel);
        add(pageSize);
        add(saveButton);
        add(returnButton);
        add(summaryLabel);
        
    }
    
    public void addSaveButtonListener(ActionListener al) {
        
        saveButton.addActionListener(al);
        
    }
    
    public void addReturnButtonListener(ActionListener al) {
        
        returnButton.addActionListener(al);
        
    }
    
    public void setSummaryLabel(String input) {
        
        summaryLabel.setText(input);
        
    }
    
}
