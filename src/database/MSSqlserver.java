package database;

import java.sql.*;

public class MSSqlserver {

    public String username;
    public String password;
    private Connection conn;

    public MSSqlserver(String username, String password) {
        this.username = username;
        this.password = password;
        conn = null;
    }

    public Connection Connect() {

        String url = "jdbc:sqlserver://localhost;databaseName=EbookStore;";

        try {
            conn = DriverManager.getConnection(url, this.username, this.password);

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
            System.err.println(ex);
        }
    }
    

}
