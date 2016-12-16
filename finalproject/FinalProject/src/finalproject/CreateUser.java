/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class CreateUser extends JPanel implements ActionListener {
    
    private JLabel nameLabel, ageLabel, addressLabel, emailLabel, usernameLabel,
                   passwordLabel, companyLabel, salaryLabel, hoursLabel, createUser;
    public JTextField nameTF, ageTF, addressTF, emailTF, usernameTF, passwordTF,
                      companyTF, salaryTF, hoursTF;
    public JButton submitButton;
    
    public Database db;
    
    public CreateUser(Database db) {
        
        super.setBackground(Color.WHITE);
        
        this.db = db;
        
        setLayout(null);
        
        nameLabel = new JLabel("Name: ");
        ageLabel = new JLabel("Age: ");
        addressLabel = new JLabel("Address: ");
        emailLabel = new JLabel("Email: ");
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        companyLabel = new JLabel("Company: ");
        salaryLabel = new JLabel("Salary: ");
        hoursLabel = new JLabel("Hours: ");
        
        createUser = new JLabel("Create a new user");
        submitButton = new JButton("Submit");
        
        nameTF = new JTextField();
        ageTF = new JTextField();
        addressTF = new JTextField();
        emailTF = new JTextField();
        usernameTF = new JTextField();
        passwordTF = new JTextField();
        companyTF = new JTextField();
        salaryTF = new JTextField();
        hoursTF = new JTextField();
        
        add(nameLabel);
        add(ageLabel);
        add(addressLabel);
        add(emailLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(companyLabel);
        add(salaryLabel);
        add(hoursLabel);
        
        add(createUser);
        add(submitButton);
        
        add(nameTF);
        add(ageTF);
        add(addressTF);
        add(emailTF);
        add(usernameTF);
        add(passwordTF);
        add(companyTF);
        add(salaryTF);
        add(hoursTF);
        
        nameLabel.setBounds(350, 50, 100, 30);
        ageLabel.setBounds(350, 100, 100, 30);
        addressLabel.setBounds(350, 150, 100, 30);
        emailLabel.setBounds(350, 200, 100, 30);
        usernameLabel.setBounds(350, 250, 100, 30);
        passwordLabel.setBounds(350, 300, 100, 30);
        companyLabel.setBounds(350, 350, 100, 30);
        salaryLabel.setBounds(350, 400, 100, 30);
        hoursLabel.setBounds(350, 450, 100, 30);
        
        createUser.setBounds(350, 10, 200, 30);
        
        nameTF.setBounds(450, 50, 150, 30);
        ageTF.setBounds(450, 100, 150, 30);
        addressTF.setBounds(450, 150, 150, 30);
        emailTF.setBounds(450, 200, 150, 30);
        usernameTF.setBounds(450, 250, 150, 30);
        passwordTF.setBounds(450, 300, 150, 30);
        companyTF.setBounds(450, 350, 150, 30);
        salaryTF.setBounds(450, 400, 150, 30);
        hoursTF.setBounds(450, 450, 150, 30);
        
        submitButton.setBounds(650, 450, 100, 30);
        submitButton.addActionListener(this);
                        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int ageInt = Integer.parseInt(ageTF.getText());
        double salaryDouble = Double.parseDouble(salaryTF.getText());
        double hoursDouble = Double.parseDouble(hoursTF.getText());
        
        String SQL = "insert into Person values ('" + nameTF.getText()
                   + "', " + ageInt + ", '" + addressTF.getText()
                   + "', '" + emailTF.getText() + "', '" + usernameTF.getText()
                   + "', '" + passwordTF.getText() + "', '" + companyTF.getText()
                   + "', " + salaryDouble + ", " + hoursDouble + ")";
        
        db.createNewUser(SQL);
        
        
        
    }
    
}
