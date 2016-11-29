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
    
    private NavPanel nav;
    private SplashPanel splash;
    
    private MainView mainView;
    
    public NavViewPanel(){
        
        super();
        setLayout(new BorderLayout());
        
        nav = new NavPanel();
        splash = new SplashPanel();
        
        add(nav, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
        
    }
    
    public void addSplash(NavView view) {
        
        add(view, BorderLayout.CENTER);
        
        revalidate();
        repaint();
        
    }
    
    public void addMainView(MainView mainView) {
        
        this.mainView = mainView;
        
        add(mainView, BorderLayout.CENTER);
        
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
