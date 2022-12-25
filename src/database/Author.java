package database;

import java.sql.*;

public class Author {

    public String id;
    public String firstname;
    public String lastname;
    public String dateofbirth;

    public static String GenerateRandomId(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "0123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();

    }
    
    public Author(String id, String firstname, String lastname, String dateofbirth) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }

    // very creative name
    public void SetFirstNameAndLastNameByExtractingFullName(String name) {
        String fullname[] = name.split("\\s+");
        if (fullname.length != 2) {
            this.firstname = name;
            this.lastname = "";
            return;
        }
        if (fullname[1] == null) fullname[1] = "";
        this.firstname = fullname[0];
        this.lastname = fullname[1];
    }

    public Author(String firstname, String lastname, String dateofbirth) {
        this.id = GenerateRandomId(13);
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }

    
    public int UpdateAuthors(Connection conn, Author newAut) {
        System.out.println("New Authorzzz: "
                + newAut.dateofbirth
                + " " + newAut.firstname
                + " " + newAut.lastname
                + " " + newAut.id);
        try {
            Statement stmt = conn.createStatement();
            System.out.println("Updating author of " + this.id);
            stmt.executeUpdate("update authors"
                    + "     set firstname=" + "'" + newAut.firstname + "'" + ","
                    + "     lastname=" + "'" + newAut.lastname + "'" + ","
                    + "     dateofbirth=" + "'" + newAut.dateofbirth + "'"
                    + "  where id='" + this.id + "'");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public static void CreateAuthor(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table if not exists authors ("
                + "   id char(13) primary key,"
                + "   firstname varchar(32),"
                + "   lastname varchar(32),"
                + "   dateofbirth varchar(32)"
                + ")");
        System.out.println("DB: Created table authors");
    }

    public Author() {
        this.id = GenerateRandomId(13);
    }

    public Author(String id) {
        this.id = id;
    }

    public void GetAuthor(Connection conn) {
        System.out.println("Getting author");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from authors"
                    + " WHERE id = '" + this.id + "'");
            while (rs.next()) {
                String id = rs.getString("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String dateofbirth = rs.getString("dateofbirth");

                this.firstname = firstname;
                this.lastname = lastname;
                this.dateofbirth = dateofbirth;
                this.id = id;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    // FIXME: the following code is vulnerable to sql injection
    public int AddAuthor(Connection conn) {
        System.out.println("Adding author");
        // generating a new id
        // id = GenerateRandomId(13);
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into authors(id, firstname, lastname, dateofbirth) "
                    + "values("
                    + "     '" + id + "'" + ","
                    + "     '" + firstname + "'" + ","
                    + "     '" + lastname + "'" + ","
                    + "     '" + dateofbirth + "'"
                    + ")");
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
        return 0;
    }

    public void setDateOfBirth(String dob) {
        this.dateofbirth = dob;
    }

}
