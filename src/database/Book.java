package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Book {

    public static final int MAX_BOOKS = 35;

    public String isbn;
    public String title;
    public String type;
    public int pagecount;
    public int price;
    public String year;
    
    // not yet done
    public Publisher publisher;
    public Author author;

    public Book(String isbn, String title, String type, int pagecount, int price, String year, Publisher publisher, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.pagecount = pagecount;
        this.year = year;
        this.publisher = publisher;
        this.price = price;
        this.author = author;
    }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public Book() {
    }

    public static void CreateBooks(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table if not exists books ("
                + "   isbn varchar(13) primary key not null,"
                + "   title varchar(32) unique not null,"
                + "   author integer not null,"
                + "   type varchar(32),"
                + "   pagecount integer,"
                + "   price integer,"
                + "   year varchar(32),"
                + "   publisher varchar(32) not null"
                + ")");
        System.out.println("DB: Created table books");
    }

    public int AddBook(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into books(isbn, title, author, type, pagecount, price, year, publisher)"
                    + "values("
                    + "'" + isbn + "'" + ","
                    + "'" + title + "'" + ","
                    + "'" + author.id + "'" + ","
                    + "'" + type + "'" + ","
                    + pagecount + ","
                    + price + ","
                    + "'" + year + "'" + ","
                    + "'" + publisher.code + "'"
                    + ")");
            if (publisher.AddPublisher(conn) != 0)
                System.err.println("Something went wrong adding publisher");
            if (author.AddAuthor(conn) != 0)
                System.err.println("Something went wrong adding author");
        } catch (SQLException e) {
            System.err.println(e);
            System.err.println(e.getMessage());
            return -1;
        }
        return 0;
    }

    public int UpdateBook(Connection conn, Book newBook) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update books"
                    + "set isbn = " + "'" + newBook.isbn + "'" + ","
                    + "title = " + "'" + newBook.title + "'" + ","
                    + "author = " + "'" + newBook.author.id + "'" + ","
                    + "type = " + "'" + newBook.type + "'" + ","
                    + "pagecount = " + newBook.pagecount + ","
                    + "price = " + newBook.price + ","
                    + "year = " + "'" + newBook.year + "'" + ","
                    + "publisher = " + "'" + newBook.publisher.code + "'");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public int DeleteBook(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from books where isbn = " + "'" + isbn + "'");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return isbn + ":"
                + title + ":"
                + author.firstname+" "+author.lastname  + ":" 
                + type + ":" 
                + pagecount + ":" 
                + price + ":" 
                + year + ":" 
                + publisher.code + ":" 
                + publisher.name + ":"
                + publisher.city + ":"
                + publisher.phone;
    }
    
    public static void ReDraw(Book[] b) {
        for (int i = 0; i < MAX_BOOKS; i++) {
            b[i] = new Book();
        }
    }

    public static Book[] GetAllBooks(Connection conn) {
        Book books[];
        books = new Book[MAX_BOOKS];
        ReDraw(books);

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books");
            int i = 0;
            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String type = rs.getString("type");
                int pagecount = rs.getInt("pagecount");
                int price = rs.getInt("price");
                String year = rs.getString("year");
                
                Author author = new Author(rs.getString("author"));
                System.out.println("Getting Author");
                author.GetAuthor(conn);
                Publisher publisher = new Publisher(rs.getString("publisher"));
                System.out.println("Getting Publishers");
                publisher.GetPublisher(conn);
                
                books[i].isbn = isbn;
                books[i].title = title;
                books[i].type = type;
                books[i].pagecount = pagecount;
                books[i].price = price;
                books[i].year = year;
                books[i].publisher = publisher;
                books[i].author = author;


                System.out.println(books[i].toString());

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }

    public static Book GetBook(Connection conn, String isbn) {
        Book book;
        book = new Book(isbn);

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books WHERE isbn = " + book.isbn);
            int i = 0;
            while (rs.next()) {
                String title = rs.getString("title");
                String type = rs.getString("type");
                int pagecount = rs.getInt("pagecount");
                int price = rs.getInt("price");
                String year = rs.getString("year");

                // Get Author Information
                Author author = new Author();
                author.id = rs.getString("author");
                author.GetAuthor(conn);
                
                // Get Publisher Info
                Publisher publisher = new Publisher();
                publisher.code = rs.getString("publisher");
                publisher.GetPublisher(conn);
                
                book.isbn = isbn;
                book.title = title;
                book.type = type;
                book.pagecount = pagecount;
                book.price = price;
                book.year = year;
                book.publisher = publisher;
                book.author = author;

                System.out.println(book.toString());

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return book;
    }

}
