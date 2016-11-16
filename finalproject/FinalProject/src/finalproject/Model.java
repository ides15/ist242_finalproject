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
    
    private String getFName() {
        return user.getfName();
    }
    
    private String getLName() {
        return user.getlName();
    }
    
    private int getAge() {
        return(user.getAge());
    }
    
    private String getAddress() {
        return(user.getAddress());
    }
    
    private String getEmail() {
        return(user.getEmail());
    }
    
    private String getUsername() {
        return(user.getUsername());
    }
    
    private String getPassword() {
        return(user.getPassword());
    }
    
    private String getCompany() {
        return(user.getCompany());
    }
    
}
