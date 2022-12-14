
package app;

import database.Sqlite;
import database.User;
import gui.MasterFrame;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String args[]) throws SQLException, SQLException, SQLException {
        
        // database connection
        Sqlite sql = new Sqlite();
        Connection conn = sql.Connect("data.db");
        
        User user = new User("nothing", "nothing"); // initializing the database with a random user
        
        user.CreateUsers(conn);

        // initialize frame
        MasterFrame frame = new MasterFrame(conn);
        frame.setVisible(true);
    }
}
