/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktrackingapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MenuController {
    private MenuView view;
    private MenuModel model;
    Connection connect = null;
    
    public MenuController(MenuView view, MenuModel model)
    {
        this.view = view;
        this.model = model; 
    }
    
   
}