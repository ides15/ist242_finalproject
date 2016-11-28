/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author joshu
 */
public class NavViewLeftMenuPanel extends JPanel{
    JButton HomeButton;
    JButton ProfileButton;
    JButton PayrollButton;
    JButton InstructionsButton;
    JButton CreditsButton; 
    JButton LogoffButton; 
    
public NavViewLeftMenuPanel() {
        super();       
       HomeButton = new JButton("Home");
       ProfileButton = new JButton("Profile");
       PayrollButton = new JButton("Payroll");
       InstructionsButton = new JButton("Instruction");
       CreditsButton = new JButton("Credits");
       LogoffButton = new JButton("Log Off");                     
        add(HomeButton);
        add(ProfileButton);
        add(InstructionsButton);
        add(CreditsButton);   
        add(LogoffButton);
        

    }   
}
