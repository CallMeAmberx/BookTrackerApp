package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class LoginModel {
    private String username;
    private String password;
    
    public void storeUserInfo (String username, String password) 
        {
            username = "";
            password = "";
        }

    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
  
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    void getMainView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
