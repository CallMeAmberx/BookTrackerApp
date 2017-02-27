package booktrackingapp;

import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MenuView extends JFrame{
    
    private AddBookModel AddModel;
    private AddBookView AddView;
    JFrame frame = new JFrame();

    JTabbedPane tabbedPane = new JTabbedPane();
    
public MenuView(){
    frame.getContentPane().add(tabbedPane);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    
    AddView = new AddBookView();
    
    tabbedPane.add("Add a Book", AddView);
    
    
        
    //tabbedPane.add("Second", sp);
    //frame.getContentPane().add(tabbedPane);

    /*frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize (300, 300);
    frame.setResizable(false); */  
    
    /*MenuPanel.add(name);
    MenuPanel.add(mustache);*/

    /*name.setFont(new Font("Serif", Font.BOLD, 48));
    name.setForeground(Color.BLACK);
    ImageIcon logo = new ImageIcon("booktrackingapp/mustache.png");
    mustache.setIcon(logo);*/
 
    }

    
}

 