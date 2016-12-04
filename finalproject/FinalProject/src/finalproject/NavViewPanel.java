/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class NavViewPanel extends JPanel {
    
    public NavPanel nav;
    private SplashPanel splash;
    
    public HomePanel homePanel;
    private InstructionsPanel instructionsPanel;
    private CreditsPanel creditsPanel;
    public OptionsView optionsView;
    private ProfilePanel profilePanel;
    private PayrollPanel payrollPanel;
    
    public NavViewPanel(){
        
        super();
        setLayout(new BorderLayout());
        
        nav = new NavPanel();
        splash = new SplashPanel();
        
        add(nav, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
        
        homePanel = new HomePanel();
        
    }
    
    public void addSplash(NavView navView) {
        
        add(navView, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addHomePanel(HomePanel homePanel) {
        
        this.homePanel = homePanel;
        
        add(homePanel, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addInstructionsPanel(InstructionsPanel instructionsPanel) {
        
        this.instructionsPanel = instructionsPanel;
        
        add(instructionsPanel, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addCreditsPanel(CreditsPanel creditsPanel) {
        
        this.creditsPanel = creditsPanel;
        
        add(creditsPanel, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addOptionsView(OptionsView optionsView) {
        
        this.optionsView = optionsView;
        
        add(optionsView, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void removeHomePanel() {
        
        if(this.homePanel != null)
            remove(this.homePanel);
        
    }
    
    public void removeInstructionsPanel() {
        
        if(this.instructionsPanel != null)
            remove(this.instructionsPanel);
        
    }
    
    public void removeCreditsPanel() {
        
        if(this.creditsPanel != null)
            remove(this.creditsPanel);
        
    }
    
    public void removeOptionsView() {
        
        if(this.optionsView != null)
            remove(this.optionsView);
        
    }
    
    public void removeSplash() {
        
        remove(splash);
        
    }
    
    public void addProfilePanel(ProfilePanel profilePanel){
        this.profilePanel = profilePanel;
        
        add(this.profilePanel);
        
        revalidate();
        repaint();
    }
    
    public void removeProfilePanel(){
        if(this.profilePanel != null){
            remove(this.profilePanel);
            
        }
    }
    
    public void addPayrollPanel(PayrollPanel payrollPanel){
        this.payrollPanel= payrollPanel;
        
        add(this.payrollPanel);
        
        revalidate();
        repaint();
    }
    
    public void removePayrollPanel(){
        if(this.payrollPanel != null){
            remove(this.payrollPanel);
        }
    }
    
}
