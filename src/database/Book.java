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
    public String publisher;

    public Book(String isbn, String title, String type, int pagecount, int price, String year, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.pagecount = pagecount;
        this.year = year;
        this.publisher = publisher;
        this.price = price;
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
            stmt.executeUpdate("insert into books(isbn, title, type, pagecount, price, year, publisher)"
                    + "values("
                    + "'"+isbn +"'" + ","
                    + "'"+title +"'" + ","
                    + "'"+type +"'" + ","
                    + pagecount + ","
                    + price + ","
                    + "'"+year +"'" + ","
                    + "'"+publisher +"'"
                    + ")");
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
                    + "set isbn = " + "'" +  newBook.isbn + "'" + ","
                    + "title = " + "'" + newBook.title + "'" + ","
                    + "type = " + "'" + newBook.type + "'" + ","
                    + "pagecount = " + newBook.pagecount + ","
                    + "price = " + newBook.price + ","
                    + "year = " + "'" +  newBook.year + "'" + ","
                    + "publisher = " + "'" + newBook.publisher + "'");
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
        return isbn + ":" + title + ":" + type + ":" + pagecount + ":" + price + ":" + year + ":" + publisher;
    }
    
    

    public static Book[] GetAllBooks(Connection conn) {
        Book books[];
        books = new Book[MAX_BOOKS];
        
        for (int i = 0; i < 30; i++) {
            books[i] = new Book();
        }

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
                String publisher = rs.getString("publisher");
                
                books[i].isbn = isbn; 
                books[i].title = title; 
                books[i].type = type; 
                books[i].pagecount = pagecount; 
                books[i].price = price; 
                books[i].year = year; 
                books[i].publisher = publisher; 
                        
                System.out.println(books[i].toString());
                
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
}

