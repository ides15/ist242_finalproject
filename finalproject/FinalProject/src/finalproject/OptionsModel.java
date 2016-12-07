/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;

/**
 *
 * @author John Ide | JCI5048 | PSU 2018
 */
public class OptionsModel {
    
    public Color backgroundColor;
    
    private int fontSize;
    private int pageSize;
    
    public OptionsModel() {
        
        this.backgroundColor = Color.WHITE;
        this.fontSize = 5;
        this.pageSize = 5;
        
    }
    
    public void setInfo(String backgroundColor, int fontSize, int pageSize) {
        
        
        
        setFontSize(fontSize);
        setPageSize(pageSize);
        
    }
    
    public String getInfo() {
        
        return "Background color: " + getBackgroundColor_String() 
                + ", font size: " + getFontSize() 
                + ", page size: " + getPageSize();
        
    }

    public String getBackgroundColor_String() {
        
        if(String.valueOf(backgroundColor).equals("java.awt.Color[r=255,g=0,b=0]"))
            return "Red";
        
        if(String.valueOf(backgroundColor).equals("java.awt.Color[r=0,g=255,b=0]"))
            return "Green";
        
        if(String.valueOf(backgroundColor).equals("java.awt.Color[r=0,g=0,b=255]"))
            return "Blue";
        
        else
            return "White";
        
    }
    
    public Color getBackgroundColor_Color() {
        
        return backgroundColor;
        
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    

}
