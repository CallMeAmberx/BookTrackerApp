package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class RegisterModel{
    private String name;
    private String username;
    private String password;
    private String securityquestion;
    private String answer;
    private String email;
    
    public void storeUserInfo (String name, String username, String password, String securityquestion, String answer, String email) 
        {
            name = "";
            username = "";
            password = "";
            securityquestion = "";
            answer = "";
            email = "";
        }
    
    public String getName(){
        return name;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getSecurityQuestion(){
        return securityquestion;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setSecurityQuestion(String securityquestion){
        this.securityquestion = securityquestion;
    }
    
    public void setAnswer(String answer){
        this.answer = answer;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

}