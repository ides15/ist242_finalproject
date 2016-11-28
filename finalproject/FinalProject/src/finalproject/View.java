/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class View extends JFrame {
    private Model model;
    
    private NavPanel nav;
    private SplashPanel splash;
    
    public View(Model model){
        
        super();
        setLayout(new BorderLayout());
        
        nav = new NavPanel();
        splash = new SplashPanel();
        
        add(nav, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
        
    }
    
}
