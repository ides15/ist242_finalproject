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
    
    private HomePanel homePanel;
    private InstructionsPanel instructionsPanel;
    private CreditsPanel creditsPanel;
    private OptionsPanel optionsPanel;
    
    public NavController(NavModel navModel, NavView navView) {
        
        this.navModel = navModel;
        this.navView = navView;
        
        homePanel = new HomePanel();
        instructionsPanel = new InstructionsPanel();
        creditsPanel = new CreditsPanel();
        optionsPanel = new OptionsPanel();
        
        navView.addInstructionsButtonListener(new InstructionsButtonListener());
        navView.addHomeButtonListener(new HomeButtonListener());
        navView.addCreditsButtonListener(new CreditsButtonListener());
        navView.addOptionsButtonListener(new OptionsButtonListener());
        
    }
    
    public class InstructionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToInstructionsPanel(instructionsPanel);
            
        }        
    
    }
    
    public class HomeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToHomePanel(homePanel);
            
        }
        
    }
    public class CreditsButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            navView.switchToCreditsPanel(creditsPanel);
            
        }
        
    }
    
    public class OptionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            navView.switchToOptionsPanel(optionsPanel);
            
        }
               
    }
    
}






