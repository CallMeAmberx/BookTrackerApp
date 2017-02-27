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
    JTextField genre = new JPasswordField(15);
    JTextField isbn = new JTextField(15);
    JTextArea description = new JTextArea();
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
    FlowLayout AddBookLayout = new FlowLayout();
    
    
    AddBookView(){
        final JPanel AddPanel = new JPanel();
        AddPanel.setLayout(AddBookLayout);
        AddBookLayout.setAlignment(FlowLayout.TRAILING);
        JPanel AddBook = new JPanel();
        AddBook.setLayout(new FlowLayout());
        
        /*JPanel titlePanel = new JPanel();
        JPanel authorPanel = new JPanel();
        JPanel genrePanel = new JPanel();
        JPanel isbnPanel = new JPanel();
        JPanel descriptionPanel = new JPanel();
        JPanel keywordsPanel = new JPanel();
        JPanel ownednreadPanel = new JPanel();
        JPanel buttonPanel = new JPanel();*/
             
        AddPanel.add(titleLabel);
        AddPanel.add(title);
        AddPanel.add(authorLabel);
        AddPanel.add(author);
        AddPanel.add(genreLabel);
        AddPanel.add(genre);
        AddPanel.add(isbnLabel);
        AddPanel.add(isbn);
        AddPanel.add(descriptionLabel);
        AddPanel.add(description);
        AddPanel.add(keywordsLabel);
        AddPanel.add(keywords);
        AddPanel.add(OwnedReadLabel);
        AddPanel.add(OwnedRead);
        AddPanel.add(Save);
        AddPanel.add(Clear);
        AddPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
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
