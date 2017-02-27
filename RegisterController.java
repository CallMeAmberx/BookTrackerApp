package booktrackingapp;

import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Amber Grace Ebersole
 */
public class RegisterController {
    
    private RegisterView view;
    private RegisterModel model;
    Connection connect = null;
    
    public RegisterController(RegisterView view, RegisterModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.addSubmitListener(new SubmitListener());
    }
    
    class SubmitListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            connect = DatabaseConn.getConnection();
            try {
                String query = "INSERT INTO USER (NAME, USERNAME, PASSWORD, SECURITYQUESTION, ANSWER, EMAIL) VALUES (?, ?, ?, ?, ?, ?);";
                PreparedStatement pst = connect.prepareStatement(query);
                pst.setString(1, view.getName());
                pst.setString(2, view.getUsername());
                pst.setString(3, view.getPassword());
                pst.setString(4, view.getSecurityQuestion());
                pst.setString(5, view.getAnswer());
                pst.setString(6, view.getEmail());
                pst.execute();
                JOptionPane.showMessageDialog(null, "You have been successfully registered!");
                
                view.dispose();
                LoginView LV = new LoginView();
                LV.setVisible(true);
            }
            catch(SQLException ex){
                 JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }
    
}
