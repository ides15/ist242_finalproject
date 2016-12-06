package finalproject;

import java.awt.Color;
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
    
    private NavModel navModel;
    private NavView navView;
    
    public Database db;
    
    public HomePanel homePanel;
    private InstructionsPanel instructionsPanel;
    private CreditsPanel creditsPanel;
    private LoginPanel loginPanel;
    public OptionsView optionsView;
    public OptionsModel optionsModel;
    public OptionsController optionsController;
    private ProfilePanel profilePanel;
    private PayrollPanel payrollPanel;
    
    private Color backgroundColor;
    
    private Person person = new Person();
    
    public NavController(NavModel navModel, NavView navView, Database db) {
        
        this.navModel = navModel;
        this.navView = navView;
        this.db = db;
        
        if(db.verified == true) System.out.println("db is verified");
        if(db.verified == false) System.out.println("db is not verified");
        
        homePanel = new HomePanel();
        loginPanel = new LoginPanel(db);
        instructionsPanel = new InstructionsPanel();
        creditsPanel = new CreditsPanel();
        optionsView = new OptionsView(optionsModel);
        optionsModel = new OptionsModel();
        optionsController = new OptionsController(optionsModel, optionsView);
        profilePanel = new ProfilePanel(person);
        payrollPanel = new PayrollPanel(person);
        
        backgroundColor = Color.WHITE;
        
        navView.addInstructionsButtonListener(new InstructionsButtonListener());
        navView.addHomeButtonListener(new HomeButtonListener());
        navView.addCreditsButtonListener(new CreditsButtonListener());
        navView.addOptionsButtonListener(new OptionsButtonListener());
        navView.addPayrollButtonListener(new PayrollButtonListener());
        navView.addProfileButtonListener(new ProfileButtonListener());
        navView.addLoginButtonListener(new LoginButtonListener());
                
    }
    
    public void setColor(Color background) {
        
        this.backgroundColor = background;
        
    }
    
    public class InstructionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            instructionsPanel.setBackground(backgroundColor);
            navView.switchToInstructionsPanel(instructionsPanel);
            
        }        
    
    }
    
    public class HomeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            homePanel.setBackground(backgroundColor);
            navView.switchToHomePanel(homePanel);
            homePanel.optionsLabel.setText(optionsModel.getInfo());
                   
        }
        
    }
    
    public class CreditsButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            creditsPanel.setBackground(backgroundColor);
            navView.switchToCreditsPanel(creditsPanel);
            
        }
        
    }
    
    public class OptionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsView.setBackground(backgroundColor);
            navView.switchToOptionsPanel(optionsView);
            
        }
               
    }
    
    public class ProfileButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            profilePanel.setBackground(backgroundColor);
            navView.switchToProfilePanel(profilePanel);
            
        }
        
    }
    
    public class PayrollButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            payrollPanel.setBackground(backgroundColor);
            navView.switchToPayrollPanel(payrollPanel);
            
        }
        
    }
    
    public class LoginButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            loginPanel.setBackground(backgroundColor);
            navView.switchToLoginPanel(loginPanel);
            
        }
        
    }
    
   
    
}






