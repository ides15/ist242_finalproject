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
    
    private String backgroundColor;
    
    private int fontSize;
    private int pageSize;
    
    public OptionsModel() {
        
        this.backgroundColor = "white";
        this.fontSize = 5;
        this.pageSize = 5;
        
    }
    
    public void saveOptionsInfo(String backgroundColor, int fontSize, int pageSize) {
        
        setBackgroundColor(backgroundColor);
        setFontSize(fontSize);
        setPageSize(pageSize);
        
    }
    
    public String returnOptionsInfo() {
        
        return "Background color: " + getBackgroundColor() + ", font size: "
                + getFontSize() + ", page size: " + getPageSize();
        
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
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
