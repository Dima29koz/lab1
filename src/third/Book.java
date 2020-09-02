package third;

public class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public Book(String title) {
        this.title = title;
        this.genre = "unnkown";
    }
    public void setTitle (String title){
        this.title = title;
    }
    public void setGenre (String genre){
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre (){
        return genre;
    }
    public String toString(){
        return this.title+" - "+this.genre;
    }
}
