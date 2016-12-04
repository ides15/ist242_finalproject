package finalproject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkc5101
 */
public class ProfilePanel extends JPanel implements ActionListener{
    private JLabel user;
    private JLabel password;
    private JLabel email;
    private JLabel name;
    private JLabel age;
    private JLabel address;
    
    private JTextField userField;
    private JTextField passField;
    private JTextField emailField;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField addressField;
    
    private JButton saveButton;
    
    private JLabel dataSaved;
    
    private Person person;

    public ProfilePanel(Person person) {
        
        GridLayout grid = new GridLayout(7,2);
        setLayout(grid);
        
        this.person = person;
        
        user = new JLabel("User: ");
        password = new JLabel("Password: ");
        email = new JLabel("Email: ");
        name = new JLabel("Name: ");
        age = new JLabel("Age: ");
        address = new JLabel("Address: ");
        dataSaved = new JLabel();
        
        userField = new JTextField(person.getUsername());
        passField = new JTextField(person.getPassword());
        emailField = new JTextField(person.getEmail());
        nameField = new JTextField(person.getName());
        ageField = new JTextField(person.getAge());
        addressField = new JTextField(person.getAddress());
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        
        
        add(user);
        add(userField);
        add(password);
        add(passField);
        add(email);
        add(emailField);
        add(name);
        add(nameField);
        add(age);
        add(ageField);
        add(address);
        add(addressField);
        add(saveButton);
        add(dataSaved);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        person.setUsername(userField.getText());
        person.setPassword(passField.getText());
        person.setEmail(emailField.getText());
        person.setName(nameField.getText());
        person.setAge(ageField.getText());
        person.setAddress(addressField.getText());
        dataSaved.setText("Data Saved.");
                
    }
    
    
    
}

