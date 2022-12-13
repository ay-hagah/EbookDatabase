
package app;

import database.Sqlite;
import database.Users;
import gui.MasterFrame;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String args[]) throws SQLException, SQLException, SQLException {
        
        // database connection
        Sqlite sql = new Sqlite();
        Connection conn = sql.Connect("data.db");

        // initialize frame
        MasterFrame frame = new MasterFrame(conn);
        frame.setVisible(true);

        
        
        Users user = new Users("Hello", "World");
        
        user.CreateUsers(conn);
        user.AddUser(conn);
        
        Users usr = Users.GetUserByUsername(conn, "Hello");
        
        System.out.println("id = " + usr.id);
        System.out.println("username = " + usr.username);
        System.out.println("password = " + usr.password);
        
        System.out.println(System.getProperty("os.name"));
    }
}
