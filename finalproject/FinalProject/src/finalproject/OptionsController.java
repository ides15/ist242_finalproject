/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.StyleConstants;

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
        
        optionsView.addSaveButtonListener(new SaveButtonListener());
        optionsView.addRedButtonListener(new RedButtonListener());
        optionsView.addBlueButtonListener(new BlueButtonListener());
        optionsView.addGreenButtonListener(new GreenButtonListener());
    }
    
    public class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsModel.setInfo(optionsModel.backgroundColor.toString(), 
                        optionsView.fontSize.getValue(), 
                        optionsView.pageSize.getValue());
            
                
            optionsView.summaryLabel.setText(optionsModel.getInfo());

        }
            
    }
    
public class RedButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsView.changeBackgroundRed();
            optionsModel.setBackgroundColor(Color.RED);
        
        
        }
            
    }
public class BlueButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsView.changeBackgroundBlue();
            optionsModel.setBackgroundColor(Color.BLUE);
        
        
        }
            
    }

public class GreenButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsView.changeBackgroundGreen();
            optionsModel.setBackgroundColor(Color.GREEN);
        
        
        }
            
    }
}
