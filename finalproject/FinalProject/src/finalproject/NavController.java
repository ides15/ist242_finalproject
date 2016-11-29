package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkc5101
 */
public class NavController {
    
    NavModel navModel;
    NavView navView;
        
    MainView mainView;
    InstructionsPanel i_panel;
    
    public NavController(NavModel navModel, NavView navView) {
        
        this.navModel = navModel;
        this.navView = navView;
        
        mainView = new MainView();
        i_panel = new InstructionsPanel();
        
        navView.addInstructionsButtonListener(new InstructionsButtonListener());
    
    }
    
    class InstructionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToInstructionsPanel(i_panel);
            
        }        
    
    }
    
}






