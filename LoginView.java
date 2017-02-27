package booktrackingapp;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Amber Grace Ebersole
 */
public class LoginView extends JFrame{
    private JTextField username = new JTextField(15);
    private JPasswordField password = new JPasswordField(15);
    private JLabel usernameLabel = new JLabel("Username: ");
    private JLabel passwordLabel = new JLabel("Password: ");
    private JButton loginButton = new JButton("Log In");
    private JButton register = new JButton("Register here!");
    
    LoginView() {
    JPanel LoginPanel = new JPanel();
        
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300,300);
    this.setBackground(Color.CYAN);
    this.setLocationRelativeTo(null);
        
    LoginPanel.add(usernameLabel);
    LoginPanel.add(username);
    LoginPanel.add(passwordLabel);
    LoginPanel.add(password);  
    LoginPanel.add(loginButton);
    LoginPanel.add(register);
    
    this.add(LoginPanel);
           
    }
    public String getUsername(){
        return username.getText();
    }
    
    public String getPassword(){
        return password.getText();
    }
    
    void addLoginListener(ActionListener listenforLogin)
    {
        loginButton.addActionListener(listenforLogin);
    }
    
    void addRegisterListener(ActionListener listenforRegister)
    {
        loginButton.addActionListener(listenforRegister);
    }
    
    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
