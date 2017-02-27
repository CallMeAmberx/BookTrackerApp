package booktrackingapp;

import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Amber Grace Ebersole
 */
public class AddBookController {
    private AddBookView view;
    private AddBookModel model;
    Connection connect = null;
    
    public AddBookController(AddBookView view, AddBookModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.addSaveListener(new SaveListener());
        this.view.addClearListener(new ClearListener());
    }
    
    class SaveListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            connect = DatabaseConn.getConnection();
            try {
                String query = "INSERT INTO BOOK (TITLE, AUTHOR, GENRE, ISBN, DESCRIPTION, KEYWORDS, OWNEDREAD) VALUES (?, ?, ?, ?, ?, ?);";
                PreparedStatement pst = connect.prepareStatement(query);
                pst.setString(1, view.getTitle());
                pst.setString(2, view.getAuthor());
                pst.setString(3, view.getGenre());
                pst.setString(4, view.getISBN());
                pst.setString(5, view.getDescription());
                pst.setString(6, view.getKeywords());
                pst.setString(6, view.getOwnedRead());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Save Successful!");
            }
            catch(SQLException ex){
                 JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }
    
    class ClearListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            view.title.setText("");
            view.author.setText("");
            view.genre.setText("");
            view.isbn.setText("");
            view.description.setText("");
            view.keywords.setText("");
            view.OwnedRead.setSelectedIndex(0); 
        }
    }
}
