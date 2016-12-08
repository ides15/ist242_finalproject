/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nkc5101
 */
public class ProfilePanel extends JPanel implements ActionListener {
    
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel addressLabel;
    private JLabel dataSavedLabel;
    
    public JTextField userTextField;
    public JTextField passTextField;
    public JTextField emailTextField;
    public JTextField nameTextField;
    public JTextField ageTextField;
    public JTextField addressTextField;
    
    private JButton saveButton;
    
    public Integer INTage;
    public String STRINGage;

    public ProfilePanel(Person person, Database db) {
        
        setLayout(null);
        
        userLabel = new JLabel("User: ");
        passwordLabel = new JLabel("Password: ");
        emailLabel = new JLabel("Email: ");
        nameLabel = new JLabel("Name: ");
        ageLabel = new JLabel("Age: ");
        addressLabel = new JLabel("Address: ");
        dataSavedLabel = new JLabel();
        
        userTextField = new JTextField();
        passTextField = new JTextField();
        emailTextField = new JTextField();
        nameTextField = new JTextField();
        
        INTage = person.getAge();
        STRINGage = INTage.toString();
        ageTextField = new JTextField(STRINGage);
        
        addressTextField = new JTextField();
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        
        add(userLabel);
        userLabel.setBounds(350, 50, 100, 30);
        add(userTextField);
        userTextField.setBounds(450, 50, 200, 30);
        
        add(passwordLabel);
        passwordLabel.setBounds(350, 100, 100, 30);
        add(passTextField);
        passTextField.setBounds(450, 100, 200, 30);
        
        add(emailLabel);
        emailLabel.setBounds(350, 150, 100, 30);
        add(emailTextField);
        emailTextField.setBounds(450, 150, 200, 30);
        
        add(nameLabel);
        nameLabel.setBounds(350, 200, 100, 30);
        add(nameTextField);
        nameTextField.setBounds(450, 200, 200, 30);
        
        add(ageLabel);
        ageLabel.setBounds(350, 250, 100, 30);
        add(ageTextField);
        ageTextField.setBounds(450, 250, 200, 30);
        
        add(addressLabel);
        addressLabel.setBounds(350, 300, 100, 30);
        add(addressTextField);
        addressTextField.setBounds(450, 300, 200, 30);
        
        add(saveButton);
        saveButton.setBounds(350, 375, 100, 30);
        add(dataSavedLabel);
        dataSavedLabel.setBounds(500, 375, 100, 30);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
//        STRINGage = ageTextField.getText();
//        INTage = Integer.parseInt(STRINGage);
//        
//        person.db.updateUser(userTextField.getText(), nameTextField.getText(), 
//                INTage, addressTextField.getText(), emailTextField.getText(), 
//                passTextField.getText());
//        
//        dataSavedLabel.setText("Data Saved.");
                
    }
    
}

