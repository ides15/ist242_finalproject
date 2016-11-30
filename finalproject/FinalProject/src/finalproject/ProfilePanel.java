package finalproject;

import java.awt.GridLayout;
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
public class ProfilePanel extends JPanel{
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

    public ProfilePanel(Person person) {
        
        GridLayout grid = new GridLayout(7,2);
        setLayout(grid);
        
        user = new JLabel("User: ");
        password = new JLabel("Password: ");
        email = new JLabel("Email: ");
        name = new JLabel("Name: ");
        age = new JLabel("Age: ");
        address = new JLabel("Address: ");
        
        userField = new JTextField(person.getUsername());
        passField = new JTextField(person.getPassword());
        emailField = new JTextField(person.getEmail());
        nameField = new JTextField(person.getfName() + " " + person.getlName());
        ageField = new JTextField(person.getAge());
        addressField = new JTextField(person.getAddress());
        
        saveButton = new JButton("Save");
        
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
        
    }
    
    
    
}

