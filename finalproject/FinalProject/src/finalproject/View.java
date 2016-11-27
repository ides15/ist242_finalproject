/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class View extends JFrame{
    private Model model;
    
    // BUTTONS  
    private JButton homeButton;
    private JButton profileButton;
    private JButton payrollButton;
    private JButton instructionsButton;
    private JButton creditsButton;
    private JButton logoffButton;
    private JButton createUserButton;
    private JButton submitUserButton;
    private JButton loginButton;
    private JButton saveProfileButton;
    
    // LABELS
    private JLabel welcomeLabel;
    private JLabel signInLabel;
    private JLabel createUserLabel;
    private JLabel instructionsLabel;
    private JLabel payrollLabel;
    private JLabel profileLabel;
    private JLabel creditLabel;
    
    // TEXT FIELDS
    private JTextField username;
    private JTextField password;
    private JTextField email;
    private JTextField age;
    private JTextField address;
    private JTextField name;
    
    View(){
        
    }
    
    public JButton getProfile(){
        return profileButton;
    }
    
    public JButton getLogin(){
        return loginButton;
    }
    
    public JButton getcCreateUser(){
        return createUserButton;
    }
    
    public JButton getPayroll(){
        return payrollButton;
    }
    
    public JButton getHome(){
        return homeButton;
    }
    
    public JButton getInstrucitons(){
        return instructionsButton;
    }
    
    public JButton getCredit(){
        return creditsButton;
    }

    public JButton getLogoff(){
        return logoffButton;
    }
    
    
}
