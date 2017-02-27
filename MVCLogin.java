package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MVCLogin {
     public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginModel model = new LoginModel();
        LoginController controller = new LoginController(view, model);
        
        view.setVisible(true);
    }
}
