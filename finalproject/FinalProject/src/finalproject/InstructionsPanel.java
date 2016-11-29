/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class InstructionsPanel extends JPanel {
    
    private JLabel instructions;
    private JLabel step1;
    private JLabel step2;
    private JLabel step3;
    private JLabel step4; 
    private JLabel step5; 
    private JLabel step6;
    private JLabel step7;
    private JLabel step8;
    private JLabel blank;
    
    public InstructionsPanel() {
        
        instructions = new JLabel("Instructions:");
        
        
        step1 = new JLabel("The Login button will take you to the login page");
        step2= new JLabel("The Options button will give you the options that you can visually change");
        step3= new JLabel("The Instructions button will take you here");
        step4 = new JLabel("The Home button will take you back to the home page");
        step5 = new JLabel("The Profile button will give you the ability to edit your profile information");
        step6= new JLabel("The Payroll button will allow you to change the payroll features like salary");
        step7 = new JLabel("The Credits button will tell you a bit about the developers of the application");
        step8 = new JLabel("The Logoff button will allow you to log out of the system");
        
        add(instructions);
        add(blank);
        add(step1);
        add(step2);
        add(step3);
        add(step4);
        add(step5);
        add(step6);
        add(step7);
        add(step8);
        
    }
    
}
