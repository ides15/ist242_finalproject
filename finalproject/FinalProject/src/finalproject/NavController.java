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
        
    HomePanel homePanel;
    InstructionsPanel i_panel;
    CreditsPanel c_panel;
    
    public NavController(NavModel navModel, NavView navView) {
        
        this.navModel = navModel;
        this.navView = navView;
        
        homePanel = new HomePanel();
        i_panel = new InstructionsPanel();
        c_panel = new CreditsPanel();
        
        navView.addInstructionsButtonListener(new InstructionsButtonListener());
        navView.addHomeButtonListener(new HomeButtonListener());
        navView.addCreditButtonListener(new CreditsButtonListener());
        
    }
    
    class InstructionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToInstructionsPanel(i_panel);
            
        }        
    
    }
    
    class HomeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToHomePanel(homePanel);
            
        }
        
    }
    class CreditsButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            navView.switchToCreditsPanel(c_panel);
        }
    }
    
}






