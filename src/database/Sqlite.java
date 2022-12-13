
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Sqlite {
    
    public Connection Connect(String dbfile) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+dbfile);
    
        } catch (SQLException e) {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());

        }
        return conn;
    }
    
    
}
