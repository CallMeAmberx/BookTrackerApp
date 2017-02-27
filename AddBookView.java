package booktrackingapp;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class AddBookView extends JPanel{
    private String[] OwnedReadQuestions = {"own this book, and I've read it.", "own this book, but haven't read it.", "don't own this book, but I have read it.", "don't own this book, and I haven't read it."};
    JTextField title = new JTextField(15);
    JTextField author = new JTextField(15);
    JTextField genre = new JTextField(15);
    JTextField isbn = new JTextField(15);
    JTextField description = new JTextField(15);
    JTextField keywords = new JTextField(15);
    JComboBox OwnedRead = new JComboBox(OwnedReadQuestions);
    private JLabel titleLabel = new JLabel("Book Title: ");
    private JLabel authorLabel = new JLabel("Author: ");
    private JLabel genreLabel = new JLabel("Genre: ");
    private JLabel isbnLabel = new JLabel("ISBN: ");
    private JLabel descriptionLabel = new JLabel("Short Description: ");
    private JLabel keywordsLabel = new JLabel("3 Keywords that describe the book: ");
    private JLabel OwnedReadLabel = new JLabel("Choose a response that matches: I... ");
    private JButton Save = new JButton("Save");
    private JButton Clear = new JButton("Clear");
    
    
    AddBookView(){
        JPanel AddBook = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        /*JPanel titlePanel = new JPanel();
        JPanel authorPanel = new JPanel();
        JPanel genrePanel = new JPanel();
        JPanel isbnPanel = new JPanel();
        JPanel descriptionPanel = new JPanel();
        JPanel keywordsPanel = new JPanel();
        JPanel ownedreadPanel = new JPanel();
        JPanel buttonPanel = new JPanel();*/
         
        c.gridx = 0;
        c.gridx = 0;
        AddBook.add(titleLabel, c);
        c.gridx = 0;
        c.gridx = 1;
        AddBook.add(title, c);
        c.gridx = 1;
        c.gridx = 0;
        AddBook.add(authorLabel, c);
        c.gridx = 1;
        c.gridx = 1;
        AddBook.add(author, c);
        c.gridx = 2;
        c.gridx = 0;
        AddBook.add(genreLabel, c);
        c.gridx = 2;
        c.gridx = 1;
        AddBook.add(genre, c);
        c.gridx = 3;
        c.gridx = 0;
        AddBook.add(isbnLabel, c);
        c.gridx = 3;
        c.gridx = 1;
        AddBook.add(isbn, c);
        c.gridx = 4;
        c.gridx = 0;
        AddBook.add(descriptionLabel, c);
        c.gridx = 4;
        c.gridx = 1;
        AddBook.add(description, c);
        c.gridx = 5;
        c.gridx = 0;
        AddBook.add(keywordsLabel, c);
        c.gridx = 5;
        c.gridx = 1;
        AddBook.add(keywords, c);
        c.gridx = 6;
        c.gridx = 0;
        AddBook.add(OwnedReadLabel, c);
        c.gridx = 6;
        c.gridx = 1;
        AddBook.add(OwnedRead, c);
        c.gridx = 7;
        c.gridx = 0;
        AddBook.add(Save, c);
        c.gridx = 7;
        c.gridx = 1;
        AddBook.add(Clear, c);
        c.gridx = 8;
        c.gridx = 0;
        
        AddBook.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        
        this.add(AddBook);
    }

    public String getTitle(){
        return title.getText();
    }
    
    public String getAuthor(){
        return author.getText();
    }
    
    public String getGenre(){
        return genre.getText();
    }
    
    public String getISBN(){
        return isbn.getText();
    }
    
    public String getDescription(){
        return description.getText();
    }
    
    public String getKeywords(){
        return keywords.getText();
    }
    
    public String getOwnedRead(){
        return OwnedRead.getSelectedItem().toString();
    }
    
    void addSaveListener(ActionListener listenforSave)
    {
        Save.addActionListener(listenforSave);
    }
    
    void addClearListener(ActionListener listenforClear)
    {
        Clear.addActionListener(listenforClear);
    }
    
    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
