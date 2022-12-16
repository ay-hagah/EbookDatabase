package database;

import java.sql.*;
z
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
    
    public static void CreateAuthor(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table if not exists authors ("
                        + "   id integer primary key,"
                        + "   firstname varchar(32),"
                        + "   lastname varchar(32)"
                        + "   dateofbirth varchar(32)"
                        + ")");
        System.out.println("DB: Created table authors");
    }
    
        
    // FIXME: the following code is vulnerable to sql injection
    public int AddUser(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            // Storing passwords this way is wrong.
            // passwords must be hashed        
            stmt.executeUpdate("insert into authors(firstname, lastname, dateofbirth)"
                    + "values("
                    + "'"+firstname +"'" + ","
                    + "'"+lastname +"'" + ","
                    + "'"+dateofbirth +"'"
                    + ")");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }
}