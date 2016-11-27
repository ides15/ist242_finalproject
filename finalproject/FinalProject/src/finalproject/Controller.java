/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class Controller implements ActionListener {
    View view;
    Model model;
    
    Controller(){
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(600,600);
        view.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
