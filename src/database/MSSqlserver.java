package database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

public class MSSqlserver {

    public final String DATBASE_NAME = "ebook";
    public String username;
    public String password;
    public String port = "1433";

    private Connection conn;
    private SQLServerDataSource ds;

    private void setDataSource(String username, String password, String port, String databaseName) {
        this.ds.setUser(username);
        this.ds.setPassword(password);
        this.ds.setDatabaseName(DATBASE_NAME);
        this.ds.setPortNumber(Integer.parseInt(port));

    }

    public MSSqlserver(String username, String password) {
        this.username = username;
        this.password = password;
        conn = null;

        ds = new SQLServerDataSource();
        setDataSource(this.username, this.password,
                // Default values
                // change at your own risk
                this.port,
                this.DATBASE_NAME);
    }

    public Connection Connect() {

        String url = "jdbc:sqlserver://localhost;databaseName=EbookStore;";

        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
            e.printStackTrace();

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
