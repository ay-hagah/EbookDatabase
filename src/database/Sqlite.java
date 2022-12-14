
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sqlite {
    
    private Connection conn;

    public Sqlite() {
        conn = null;
    }
    
    
    
    public Connection Connect(String dbfile) {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+dbfile);
    
        } catch (SQLException e) {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());

        }
        return conn;
    }
    
    public void Close() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
