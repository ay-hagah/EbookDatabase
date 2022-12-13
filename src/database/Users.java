/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;


public class Users {
    
    public int id;
    public String username;
    public String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public void CreateUsers(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
//        stmt.executeUpdate("drop table if exists users");
        stmt.executeUpdate("create table if not exists users (id integer primary key , username varchar(32) unique not null, password varchar(32) not null)");
        System.out.println("DB: Created table users");
    }
    
    // FIXME: the following code is vulnerable to sql injection
    public int AddUser(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            // AAAAAAAAAAAAAAAAAAAAAAAA
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
    
    // Database code
    public static Users GetUserByUsername(Connection conn, String username) throws SQLException {
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
        
        Users usr = new Users(id, user, pass);
        return usr;
    }
}
