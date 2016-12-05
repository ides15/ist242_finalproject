/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
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
    JLabel backgroundColor;
    
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    
    public JSlider fontSize;
    public JSlider pageSize;
    
    OptionsModel optionsModel;
    
    JButton saveButton;
    
    public OptionsView(OptionsModel optionsModel) {
        
        this.optionsModel = optionsModel;
        
        redButton = new JButton("Red");
        
        blueButton = new JButton("Blue");
        
        greenButton = new JButton("Green");
        
        fontSizeLabel = new JLabel("Choose the font size: ");
        
        pageSizeLabel = new JLabel("Choose the page size: ");
        
        summaryLabel = new JLabel("No options selected.");
        
        backgroundColor = new JLabel("Background Color:");
        
        
        fontSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        fontSize.setMajorTickSpacing(1);
        fontSize.setPaintLabels(true);
        fontSize.setPaintTicks(true); 
        
        pageSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        pageSize.setMajorTickSpacing(1);
        pageSize.setPaintLabels(true);
        pageSize.setPaintTicks(true);
        
        saveButton = new JButton("save button");
        
        add(backgroundColor);
        add(redButton);
        add(blueButton);
        add(greenButton);
        add(fontSizeLabel);
        add(fontSize);
        add(pageSizeLabel);
        add(pageSize);
        add(saveButton);
        add(summaryLabel);
        
        setVisible(true);
    }
    
    public void addSaveButtonListener(ActionListener al) {
        
        saveButton.addActionListener(al);
        
    }
    
    public void addRedButtonListener(ActionListener al){
        
        redButton.addActionListener(al);
    }
    
    public void addBlueButtonListener(ActionListener al){
        
        blueButton.addActionListener(al);
    }
    
    public void addGreenButtonListener(ActionListener al){
        
        greenButton.addActionListener(al);
    }
    
    public void changeBackgroundRed(){
        setBackground(Color.RED);
    }
    
     public void changeBackgroundBlue(){
        setBackground(Color.BLUE);
    }
     
      public void changeBackgroundGreen(){
        setBackground(Color.GREEN);
    }
}
