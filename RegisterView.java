package booktrackingapp;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class RegisterView extends JFrame{
    private String[] securityquestions = {"What was the make of your first car?", "What was the name of your first pet?", "What is the title of your favorite book?"};
    private JTextField name = new JTextField(15);
    private JTextField username = new JTextField(15);
    private JPasswordField password = new JPasswordField(15);
    private JComboBox securityquestion = new JComboBox(securityquestions);
    private JTextField answer = new JTextField(15);
    private JTextField email = new JTextField(15);
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel usernameLabel = new JLabel("Username: ");
    private JLabel passwordLabel = new JLabel("Password: ");
    private JLabel securityquestionLabel = new JLabel("Choose a security question: ");
    private JLabel answerLabel = new JLabel("Answer: ");
    private JLabel emailLabel = new JLabel("Email: ");
    private JButton submit = new JButton("Submit");
    
    RegisterView(){
        
        JPanel registerPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(265,275);
        this.setBackground(Color.CYAN);
        this.setLocationRelativeTo(null);
        
        registerPanel.add(nameLabel);
        registerPanel.add(name);
        registerPanel.add(usernameLabel);
        registerPanel.add(username);
        registerPanel.add(passwordLabel);
        registerPanel.add(password);
        registerPanel.add(securityquestionLabel);
        registerPanel.add(securityquestion);
        registerPanel.add(answerLabel);
        registerPanel.add(answer);
        registerPanel.add(emailLabel);
        registerPanel.add(email);
        registerPanel.add(submit);
        
        this.add(registerPanel);
        
    }
    
    public String getName(){
        return name.getText();
    }
    
    public String getUsername(){
        return username.getText();
    }
    
    public String getPassword(){
        return password.getText();
    }
    
    public String getSecurityQuestion(){
        return securityquestion.getSelectedItem().toString();
    }
    
    public String getAnswer(){
        return answer.getText();
    }
    
    public String getEmail(){
        return email.getText();
    }
    
    void addSubmitListener(ActionListener listenforSubmit)
    {
        submit.addActionListener(listenforSubmit);
    }
    
    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
