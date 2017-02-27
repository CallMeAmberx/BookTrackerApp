/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MVCRegister {
    public static void main(String[] args) {
        RegisterView view = new RegisterView();
        RegisterModel model = new RegisterModel();
        RegisterController controller = new RegisterController(view, model);
        
        view.setVisible(true);
    }
    
}
