package finalproject;


import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nate Cox
 */
public class CreditsPanel extends JPanel{

    private JLabel credits;
    
    public CreditsPanel() {
        credits = new JLabel("This program was designed by John Ide, Nate Cox "
        + " and Weijun Xu");
        add(credits);
    }
    
    
    
}
