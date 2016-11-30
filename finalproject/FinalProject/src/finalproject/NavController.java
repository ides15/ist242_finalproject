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
    
    public HomePanel homePanel;
    private InstructionsPanel instructionsPanel;
    private CreditsPanel creditsPanel;
    
    public OptionsView optionsView;
    public OptionsModel optionsModel;
    public OptionsController optionsController;
    
    public NavController(NavModel navModel, NavView navView) {
        
        this.navModel = navModel;
        this.navView = navView;
        
        homePanel = new HomePanel();
        instructionsPanel = new InstructionsPanel();
        creditsPanel = new CreditsPanel();
        
        optionsView = new OptionsView(optionsModel);
        optionsModel = new OptionsModel();
        optionsController = new OptionsController(optionsModel, optionsView);
        
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
            
            navView.switchToOptionsPanel(optionsView);
            
        }
               
    }
    
}






