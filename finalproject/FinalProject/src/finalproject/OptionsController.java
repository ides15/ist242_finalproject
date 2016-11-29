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
    
    public HomePanel homePanel;
    
    public OptionsController(OptionsModel optionsModel, OptionsView optionsView) {
        
        this.optionsModel = optionsModel;
        this.optionsView = optionsView;
        
        homePanel = new HomePanel();
        
        optionsView.addSaveButtonListener(new SaveButtonListener());
    }
    
    public class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
                optionsModel.setInfo(optionsView.backgroundColor.getText(), 
                        optionsView.fontSize.getValue(), 
                        optionsView.pageSize.getValue());
                
                optionsView.summaryLabel.setText(optionsModel.getInfo());
                
                homePanel.optionsLabel.setText(optionsModel.getInfo());

        }
            
    }
        
}
