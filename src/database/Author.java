package database;


public class Author {
    
    public int id;
    public int firstname;
    public int lastname;
    public String dateofbirth;

    public Author(int id, int firstname, int lastname, String dateofbirth) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }
    
}