package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User {
    
    public int id;
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public void CreateUsers(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
//      stmt.executeUpdate("drop table if exists users"); // delete current table if exists
        stmt.executeUpdate("create table if not exists users (id integer primary key , username varchar(32) unique not null, password varchar(32) not null)");
        System.out.println("DB: Created table users");
    }
    
    // FIXME: the following code is vulnerable to sql injection
    public int AddUser(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            // Storing passwords this way is wrong.
            // passwords must be hashed        
            stmt.executeUpdate("insert into users(username, password) values('"+username+"', '"+password+"')");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }
    
    public boolean isAdmin() {
        return username.equals("admin");
    }
    
    public boolean ValidLogin(Connection conn, User toCheck) {
        User origin;
        try {
            origin = GetUserByUsername(conn, toCheck.username);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        if (!(toCheck.username.equals(origin.username) 
                && toCheck.password.equals(origin.password)))
            return false;
        return true;
    }
    
    // Database code
    public static User GetUserByUsername(Connection conn, String username) throws SQLException {
        Statement stmt = conn.createStatement();
        int id = -1;
        String user = null;
        String pass = null;
        
        ResultSet rs = stmt.executeQuery("select * from users WHERE username='"+username+"'");
        
        while (rs.next()) {
            id = rs.getInt("id");
            user = rs.getString("username");
            pass = rs.getString("password");
        }

        User usr = new User(id, user, pass);
        return usr;
    }
}
