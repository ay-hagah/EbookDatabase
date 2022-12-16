package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Book {

    public String isbn;
    public String title;
    public String type;
    public int pagecount;
    public String year;
    public String publisher;

    public Book(String isbn, String title, String type, int pagecount, String year, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.pagecount = pagecount;
        this.year = year;
        this.publisher = publisher;
    }

    public static void CreateBooks(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table if not exists books ("
                + "   isbn CHAR(13) primary key not null,"
                + "   title varchar(32) unique not null,"
                + "   type varchar(32),"
                + "   pagecount integer,"
                + "   type varchar(32),"
                + "   year varchar(32),"
                + "   publisher varchar(32) not null,"
                + ")");
        System.out.println("DB: Created table users");
    }

    public int AddBook(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into users"
                    + "values('"
                    + isbn + ","
                    + title + ","
                    + type + ","
                    + pagecount + ","
                    + year + ","
                    + publisher + ","
                    + "')");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public int UpdateBook(Connection conn, Book newBook) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update books"
                    + "set isbn = " + newBook.isbn + ","
                    + "title = " + newBook.title + ","
                    + "type = " + newBook.type + ","
                    + "pagecount = " + newBook.pagecount + ","
                    + "year = " + newBook.year + ","
                    + "publisher = " + newBook.publisher);
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public int DeleteBook(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from books where isbn = " + isbn);
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public Book[] GetAllBooks(Connection conn) {
        Book books[] = null;

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books");
            int i = 0;
            while (rs.next()) {
                books[i] = new Book(
                        rs.getString(isbn),
                        rs.getString(title),
                        rs.getString(type),
                        rs.getInt(pagecount),
                        rs.getString(year),
                        rs.getString(publisher)
                );
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
}

