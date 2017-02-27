
package booktrackingapp;

import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Amber Grace Ebersole
 */
public class LoginController {
    private LoginView view;
    private LoginModel model;
    Connection connect = null;
    
    public LoginController(LoginView view, LoginModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.addLoginListener(new LoginListener());
        //this.view.addRegisterListener(new RegisterListener());
    }
        
    class LoginListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            connect = DatabaseConn.getConnection();
                        try {
   				String sqlquery = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
   				PreparedStatement pst = connect.prepareStatement(sqlquery);
   				pst.setString(1, view.getUsername());
   				pst.setString(2, view.getPassword());
   				ResultSet rs = pst.executeQuery();
   				int count = 0;
   				while (rs.next())
   				{
                                    count = count + 1;
   				}
   				if (count == 1)
   				{
                                    JOptionPane.showMessageDialog(null, "Username and password is correct.");
                                    
                                    MenuView MV = new MenuView();
                                    MV.setVisible(true);
                                    view.dispose();
   				}
   				else
   				{
   				JOptionPane.showMessageDialog(null, "Username and password is incorrect.");
                                }   			
                            }
   			catch(SQLException ex){
                                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                            }
        }
        
    }
    
    /*class RegisterListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e1){
                //Jframe.dispose();
                RegisterView RV = new RegisterView();
                RV.setVisible(true);

        }
    }*/
}
