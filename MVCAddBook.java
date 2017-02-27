package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class MVCAddBook {
    public static void main(String[] args) {
        AddBookView view = new AddBookView();
        AddBookModel model = new AddBookModel();
        AddBookController controller = new AddBookController(view, model);
        
        view.setVisible(true);
    }
}
