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
public class OptionsModel {
    
    String backgroundColor;
    
    int fontSize;
    int pageSize;
    
    public OptionsModel() {
        
        this.backgroundColor = "white";
        this.fontSize = 5;
        this.pageSize = 5;
        
    }
    
    public void saveReturnInfo(String backgroundColor, int fontSize, int pageSize) {
        
        this.backgroundColor = backgroundColor;
        this.fontSize = fontSize;
        this.pageSize = pageSize;
        
    }
    
    public String returnOptionsInfo() {
        
        return "Background color: " + this.backgroundColor + ", font size: "
                + this.fontSize + ", page size: " + this.pageSize;
        
    }

}
