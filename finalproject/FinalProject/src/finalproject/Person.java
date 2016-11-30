/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class Person {
    private String fName;
    private String lName;
    private int age;
    private String address;
    private String email;
    private String username;
    private String password;
    private String company;
    private double paycheck;
    private double YTDPay;
    private double taxesPercent;
    private double taxesTaken;
    private double salary;
    private double hours;
    
    private Person() {
        
        fName = "User";
        
    }
    
    public double getPaycheck() {
        paycheck = (salary * hours) * taxesPercent;
        return paycheck;        
    }
    
    public double getYTDPay() {
        YTDPay = getPaycheck() * 26;
        return YTDPay;
    }
    
    public double getTaxesTaken() {
        taxesTaken = getPaycheck() - (salary * hours);
        return taxesTaken;
    }
    
    public double getTaxesPercent() {
        return taxesPercent;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public double getHours() {
        return hours;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
}
