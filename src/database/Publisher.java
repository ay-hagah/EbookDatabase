
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Publisher {
    
    public String code;
    public String name;
    public String city;
    public String phone;

    public Publisher(String code, String name, String city, String phone) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public Publisher() {}
    public Publisher(String code) {this.code = code;}

    public static void CreatePublisher(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table if not exists publishers ("
                        + "   code varchar(10) primary key unique,"
                        + "   name varchar(32),"
                        + "   city varchar(32),"
                        + "   phone varchar(32)"
                        + ")");
        System.out.println("DB: Created table publishers");
    }

    public int AddPublisher(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into publishers(code, name, city, phone) "
                    + " values("
                    + "     '"+code +"'" + ","
                    + "     '"+name +"'" + ","
                    + "     '"+city +"'" + ","
                    + "     '"+phone +"'"
                    + ")");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }
    
    public int UpdatePublisher(Connection conn, Publisher newPub) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update publishers"
                    + "     set code = " + "'" + newPub.code + "'" + ","
                    + "     name = " + "'" + newPub.name + "'" + ","
                    + "     city = " + "'" + newPub.city + "'" + ","
                    + "     phone = " + "'" + newPub.phone + "'");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }
    
    public void GetPublisher(Connection conn) {
        System.out.println("Getting Publishers");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from publishers WHERE code = " + this.code);
            while (rs.next()) {
                String name = rs.getString("name");
                String code = rs.getString("code");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                this.code = code;
                this.name = name;
                this.city = city;
                this.phone = phone;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    
}
