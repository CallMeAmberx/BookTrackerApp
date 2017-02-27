package booktrackingapp;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MenuView extends JFrame{
    
    private AddBookModel AddModel;
    private AddBookView AddView = new AddBookView();;
    JFrame frame = new JFrame();

    public JTabbedPane tabbedPane = new JTabbedPane();
    
public MenuView(){
    frame.getContentPane().add(tabbedPane);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(525, 320);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
    
    tabbedPane.add("Add a Book", AddView);
    
    
    /*MenuPanel.add(name);
    MenuPanel.add(mustache);*/

    /*name.setFont(new Font("Serif", Font.BOLD, 48));
    name.setForeground(Color.BLACK);
    ImageIcon logo = new ImageIcon("booktrackingapp/mustache.png");
    mustache.setIcon(logo);*/
 
    }

    
}

 