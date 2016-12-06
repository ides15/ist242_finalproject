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
public class CreditsPanel extends JPanel {
    
    private JLabel creditsLabel;
    
    public CreditsPanel() {
        
        creditsLabel = new JLabel("<html>Developers:<br><br>John Ide - ide.johnc@gmail.com"
                + "<br>Nate Cox - nkc5010@psu.edu"
                + "<br>Weijun Xu - wfx5003@psu.edu</html>");
        
        add(creditsLabel);
        
    }
}