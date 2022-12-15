package database;


public class Book {
    
    public String ISBN;
    public String title;
    public String type;
    public int pagecount;
    public String year;
    public String publisher;

    public Book(String ISBN, String title, String type, int pagecount, String year, String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        this.type = type;
        this.pagecount = pagecount;
        this.year = year;
        this.publisher = publisher;
    }
    
    
    
}
