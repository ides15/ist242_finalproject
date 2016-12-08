package finalproject;

import java.awt.Color;
import java.awt.Font;
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
    
    public NavController(NavModel navModel, NavView navView, 
                         Database db, Person user) {
        
        this.navModel = navModel;
        this.navView = navView;
        this.db = db;
        
        homePanel = new HomePanel();
        loginPanel = new LoginPanel(db);
        instructionsPanel = new InstructionsPanel();
        creditsPanel = new CreditsPanel();
        optionsView = new OptionsView(optionsModel);
        optionsModel = new OptionsModel();
        optionsController = new OptionsController(optionsModel, optionsView);
        profilePanel = new ProfilePanel(user, db);
        payrollPanel = new PayrollPanel(user);
        
        backgroundColor = Color.WHITE;
        
        navView.addInstructionsButtonListener(new InstructionsButtonListener());
        navView.addHomeButtonListener(new HomeButtonListener());
        navView.addCreditsButtonListener(new CreditsButtonListener());
        navView.addOptionsButtonListener(new OptionsButtonListener());
        navView.addPayrollButtonListener(new PayrollButtonListener());
        navView.addProfileButtonListener(new ProfileButtonListener());
        navView.addLoginButtonListener(new LoginButtonListener());
        navView.addLogoffButtonListener(new LogoffButtonListener());
                        
    }
    
    public class InstructionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(db.verified == true) {

                instructionsPanel.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToInstructionsPanel(instructionsPanel);
                
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the instructions page.");
                        
        }        
    
    }
    
    public class HomeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(db.verified == true) {
                
                homePanel.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToHomePanel(homePanel);
                homePanel.optionsLabel.setText(optionsModel.getInfo());
                
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the home page.");
                               
        }
        
    }
    
    public class CreditsButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(db.verified == true) {
            
                creditsPanel.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToCreditsPanel(creditsPanel);
            
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the credits page.");
                        
        }
        
    }
    
    public class OptionsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(db.verified == true) {
            
                optionsView.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToOptionsPanel(optionsView);
            
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the options page.");
                        
        }

       
               
    }
    
    public class ProfileButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(db.verified == true) {
            
                profilePanel.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToProfilePanel(profilePanel);
                profilePanel.userTextField.setText(db.getUser(loginPanel.usernameTextField.getText()));
                profilePanel.passTextField.setText(db.getPass(loginPanel.passwordTextField.getText()));
            
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the profile page.");
                        
        }
        
    }
    
    public class PayrollButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(db.verified == true) {
            
                payrollPanel.setBackground(optionsModel.getBackgroundColor_Color());
                navView.switchToPayrollPanel(payrollPanel);
            
            }
            
            else
                loginPanel.resultLabel.setText("Please login to access the payroll page.");
            
        }
        
    }
    
    public class LoginButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            loginPanel.setBackground(optionsModel.getBackgroundColor_Color());
            navView.switchToLoginPanel(loginPanel);
            loginPanel.resultLabel.setText(null);
                        
        }
        
    }
    
    public class LogoffButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            optionsModel.setBackgroundColor(Color.WHITE);
            optionsView.summaryLabel.setText("No options selected.");
            optionsView.fontSize.setValue(5);
            optionsView.pageSize.setValue(5);
            
            db.setVerified(false);
            navView.switchToLoginPanel(loginPanel);
            loginPanel.resultLabel.setText("Please re-enter credentials.");
            loginPanel.usernameTextField.setText(null);
            loginPanel.passwordTextField.setText(null);
            
                        
                                                           
        } 
        
    }
    
   
    
}






