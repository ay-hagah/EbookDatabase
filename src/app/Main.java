
package app;

import database.*;
import gui.MasterFrame;
import java.sql.*;


public class Main {

          // required by microsoft sql server database connection
//        private static final String username = "dbuser";
//        private static final String password = "dbpass";

    
    public static void main(String args[]) throws SQLException, SQLException, SQLException {
        
        // SQLite database connection
        Sqlite sql = new Sqlite();
        Connection conn = sql.Connect("data.db");


        // Microsoft SQL Server database connection
        //MSSqlserver sql = new MSSqlserver(username, password);
        //Connection conn = sql.Connect();
        
        // create tables
        User.CreateUsers(conn);
        Book.CreateBooks(conn);
        Author.CreateAuthor(conn);
        Publisher.CreatePublisher(conn);
        
        // initialize frame
        MasterFrame frame = new MasterFrame(conn);
        frame.setVisible(true);
    }
}
