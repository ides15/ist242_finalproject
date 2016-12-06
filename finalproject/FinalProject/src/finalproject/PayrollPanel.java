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
 * @author nkc5101
 */
public class PayrollPanel extends JPanel {
    
    private JLabel company;
    private JLabel currentPeriod;
    private JLabel YTDPay;
    private JLabel taxes;
    private JLabel salary;
    private JLabel hoursWorked;

    public PayrollPanel(Person person) {
        
        setLayout(null);
        
        company = new JLabel("Company: " + person.getCompany());
        currentPeriod = new JLabel("Current Paycheck: " + person.getPaycheck());
        YTDPay = new JLabel("YTD Pay: " + person.getYTDPay());
        taxes = new JLabel("Taxes: " + person.getTaxesTaken());
        salary = new JLabel("Salary: " + person.getSalary());
        hoursWorked = new JLabel("Hours Worked: " + person.getHours());
        
        add(company);
        company.setBounds(350, 50, 300, 30);
        
        add(currentPeriod);
        currentPeriod.setBounds(350, 100, 300, 30);
        
        add(YTDPay);
        YTDPay.setBounds(350, 150, 300, 30);
        
        add(taxes);
        taxes.setBounds(350, 200, 300, 30);
        
        add(salary);
        salary.setBounds(350, 250, 300, 30);
        
        add(hoursWorked);
        hoursWorked.setBounds(350, 300, 300, 30);
        
    }
    
}
