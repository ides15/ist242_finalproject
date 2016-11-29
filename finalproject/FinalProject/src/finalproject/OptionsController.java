/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsController {
    
    public OptionsModel optionsModel;
    public OptionsView optionsView;
    
    public OptionsController(OptionsModel optionsModel, OptionsView optionsView) {
        
        this.optionsModel = optionsModel;
        this.optionsView = optionsView;
        
        optionsView.addSaveButtonListener(new ButtonListener());
        optionsView.addReturnButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            JButton eventSource = (JButton)e.getSource();
            
            if(eventSource == optionsView.saveButton) {
            
                System.out.println("save button");

            }
            
            if(eventSource == optionsView.returnButton) {
                
                System.out.println("return button");
                
            }
            
        }
        
    }
    
}
