package booktrackingapp;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MVCMenu extends JFrame{
    MenuView View;
    MenuController Controller;
    MenuModel Model;
    //(string username)
    
    //public static void main(String[] args){
    public MVCMenu(String username) throws SQLException{
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (250, 300);
        setResizable(false);
        
        View = new MenuView();
        Model = new MenuModel(username);
        Controller = new MenuController(View, Model);
        View.setVisible(true);    

    }
    
    public MenuView getMenuView() {
        return View;
    }
}
