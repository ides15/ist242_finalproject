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
    
    NavModel model;
    NavViewPanel navViewPanel;
    
    public NavView(NavModel model) {
        
        super("Payroll System");
        this.model = model;
              
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        
        navViewPanel = new NavViewPanel();
        
        add(navViewPanel);
        
    }
    
    public void switchToMainPanel(MainView mainView) {
        
        navViewPanel.removeSplash();
        navViewPanel.addMainView(mainView);
                
    }
    
    public void switchToInstructionsPanel(InstructionsPanel i_panel) {
        
        navViewPanel.removeMainView();
        navViewPanel.addInstructionsPanel(i_panel);
        
    }
    
    public void addInstructionsButtonListener(ActionListener al) {
        
        navViewPanel.nav.instructionsButton.addActionListener(al);
                
    }
    
}





