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
public class Model {
    private Person user;
    
    private String getName() {
        return user.getName();
    }
    
    private void setName(String name) {
        user.setName(name);
    }
    
    private int getAge() {
        return user.getAge();
    }
    
    private void setAge(int age) {
        user.setAge(age);
    }
    
    private String getAddress() {
        return user.getAddress();
    }
    
    private void setAddress(String address) {
        user.setAddress(address);
    }
    
    private String getEmail() {
        return user.getEmail();
    }
    
    private void setEmail(String email) {
        user.setEmail(email);
    }
    
    private String getUsername() {
        return user.getUsername();
    }
    
    private void setUsername(String username) {
        user.setUsername(username);
    }
    
    private String getPassword() {
        return user.getPassword();
    }
    
    private void setPassword(String password) {
        user.setPassword(password);
    }
    
    private String getCompany() {
        return user.getCompany();
    }
    
    private void setCompany(String company) {
        user.setCompany(company);
    }
    
}
