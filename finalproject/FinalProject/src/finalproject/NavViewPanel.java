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
    
    NavPanel nav;
    SplashPanel splash;
    
    private MainView mainView;
    private InstructionsPanel i_panel;
    
    public NavViewPanel(){
        
        super();
        setLayout(new BorderLayout());
        
        nav = new NavPanel();
        splash = new SplashPanel();
        
        add(nav, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
        
    }
    
    public void addSplash(NavView navView) {
        
        add(navView, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addMainView(MainView mainView) {
        
        this.mainView = mainView;
        
        add(mainView, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addInstructionsPanel(InstructionsPanel i_panel) {
        
        this.i_panel = i_panel;
        
        add(i_panel, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void removeMainView() {
        
        if(this.mainView != null)
            remove(this.mainView);
        
    }
    
    public void removeSplash() {
        
        remove(splash);
        
    }
    
}
