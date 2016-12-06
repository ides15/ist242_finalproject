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

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsView extends JPanel {
    
    public JLabel fontSizeLabel;
    public JLabel pageSizeLabel;
    public JLabel summaryLabel;
    public JLabel backgroundColorLabel;
    
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    
    public JSlider fontSize;
    public JSlider pageSize;
    
    OptionsModel optionsModel;
    
    JButton saveButton;
    
    public OptionsView(OptionsModel optionsModel) {
        
        setLayout(null);
        
        this.optionsModel = optionsModel;
        
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        greenButton = new JButton("Green");
        
        fontSizeLabel = new JLabel("Choose the font size: ");
        pageSizeLabel = new JLabel("Choose the page size: ");
        summaryLabel = new JLabel("No options selected.");
        
        backgroundColorLabel = new JLabel("Background Color:");
        
        fontSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        fontSize.setMajorTickSpacing(1);
        fontSize.setPaintLabels(true);
        fontSize.setPaintTicks(true); 
        
        pageSize = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        pageSize.setMajorTickSpacing(1);
        pageSize.setPaintLabels(true);
        pageSize.setPaintTicks(true);
        
        saveButton = new JButton("Save");
        
        add(backgroundColorLabel);
        backgroundColorLabel.setBounds(300, 50, 120, 30);
        add(redButton);
        redButton.setBounds(450, 50, 75, 30);
        add(blueButton);
        blueButton.setBounds(550, 50, 75, 30);
        add(greenButton);
        greenButton.setBounds(650, 50, 75, 30);
        
        add(fontSizeLabel);
        fontSizeLabel.setBounds(300, 100, 150, 50);
        add(fontSize);
        fontSize.setBounds(450, 100, 250, 50);
        
        add(pageSizeLabel);
        pageSizeLabel.setBounds(300, 175, 150, 50);
        add(pageSize);
        pageSize.setBounds(450, 175, 250, 50);
        
        add(saveButton);
        saveButton.setBounds(300, 250, 100, 30);
        add(summaryLabel);
        summaryLabel.setBounds(450, 250, 600, 30);
        
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
    
    public void changeBackgroundRed() {
        
        setBackground(Color.RED);
        
    }
    
     public void changeBackgroundBlue() {
         
        setBackground(Color.BLUE);
        
    }
     
      public void changeBackgroundGreen() {
          
        setBackground(Color.GREEN);
        
    }
}
