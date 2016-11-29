/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author jci5048
 */
public class NavView extends JFrame {
    
    public NavModel model;
    public NavViewPanel navViewPanel;
    
    public NavView(NavModel model) {
        
        super("Payroll System");
        this.model = model;
              
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        
        navViewPanel = new NavViewPanel();
        
        add(navViewPanel);
        
    }
    
    public void switchToHomePanel(HomePanel homePanel) {
        
        navViewPanel.removeInstructionsPanel();
        navViewPanel.removeSplash();
        navViewPanel.removeCreditsPanel();
        navViewPanel.addHomePanel(homePanel);
                
    }
    
    public void switchToInstructionsPanel(InstructionsPanel instructionsPanel) {
        
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeCreditsPanel();
        navViewPanel.addInstructionsPanel(instructionsPanel);
        
    }
    
    public void switchToCreditsPanel(CreditsPanel creditsPanel) {
        
        navViewPanel.removeSplash();
        navViewPanel.removeHomePanel();
        navViewPanel.removeInstructionsPanel();
        navViewPanel.addCreditsPanel(creditsPanel);
                
    }
    
    public void addInstructionsButtonListener(ActionListener al) {
        
        navViewPanel.nav.instructionsButton.addActionListener(al);
                
    }
    
    public void addHomeButtonListener(ActionListener al) {
        
        navViewPanel.nav.homeButton.addActionListener(al);
                
    }

    public void addCreditsButtonListener(ActionListener al) {
        
        navViewPanel.nav.creditsButton.addActionListener(al);
                
    }
    
}
