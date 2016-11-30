package finalproject;

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
public class PayrollPanel extends JPanel {
    
    private JLabel company;
    private JLabel currentPeriod;
    private JLabel YTDPay;
    private JLabel taxes;
    private JLabel salary;
    private JLabel hoursWorked;

    public PayrollPanel(Person person) {
        
        company = new JLabel();
        company.setText("Company :" + person.getCompany());
        currentPeriod = new JLabel("Current Paycheck:" + person.getPaycheck());
        YTDPay = new JLabel("YTD Pay: " + person.getYTDPay());
        taxes = new JLabel("Taxes: " + person.getTaxes());
        salary = new JLabel("Salary: " + person.getSalary());
        hoursWorked = new JLabel("Hours Worked: " + person.getHours());
        
        add(company);
        add(currentPeriod);
        add(YTDPay);
        add(taxes);
        add(salary);
        add(hoursWorked);
        
    }
   
    
    
    
}
