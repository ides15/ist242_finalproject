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
public class App {
    public static void main(String[] args) {
        
        Database db = new Database();
        Person user = new Person(db);
        
        NavModel model = new NavModel();
        NavView view = new NavView(model);
        NavController controller = new NavController(model, view, db, user);
        
        view.setVisible(true);
        
    }
}