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
    
    private String name;
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
    
    public Database db;
    
    public Person(Database db) {
        
        name = "John Ide";
        age = 20;
        address = "8514 Oakford Dr.";
        email = "ide.johnc@gmail.com";
        username = "ide.johnc";
        password = "password";
        company = "PSU";
        taxesPercent = 0.95;
        salary = 10.00;
        hours = 10.00;
        
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
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getHours() {
        return hours;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
