package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
public class AddBookModel {
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private String description;
    private String keywords;
    private String ownedORread;
 
    public void storeUserInfo (String title, String author, String genre, String isbn, String deescription, String keywords, String ownedORread) 
        {
            title = "";
            author = "";
            genre = "";
            isbn = "";
            description = "";
            keywords = "";
            ownedORread = "";
        }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getISBN(){
        return isbn;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getKeywords(){
        return keywords;
    }
    
    public String getownedORread(){
        return ownedORread;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setKeywords(String keywords){
        this.keywords = keywords;
    }
    
    public void setownedORread(String ownedORread){
        this.ownedORread = ownedORread;
    }
}
