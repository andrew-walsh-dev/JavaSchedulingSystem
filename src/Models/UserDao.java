package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Connection connection;

    public UserDao() throws SQLException {
        try {
            this.connection = DriverManager.getConnection(Config.getDbUrl(), Config.getDbUsername(), Config.getDbPassword());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public List<User> getAllUsers() throws SQLException {
        String q = "SELECT * FROM users";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(q);
        ArrayList<User> users = new ArrayList<>();
        while (rs.next()) {
            users.add(new User(
                    rs.getInt("User_ID"),
                    rs.getString("User_Name"),
                    rs.getString("Password"),
                    rs.getDate("Create_Date"),
                    rs.getString("Created_By"),
                    rs.getDate("Last_Update"),
                    rs.getString("Last_Updated_By")
            ));
        }
        return users;
    }

    public User getUserById(int id) throws SQLException {
        String q = String.format("SELECT * FROM users WHERE User_ID = %f", id);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(q);
        rs.next();
        return new User(
                rs.getInt("User_ID"),
                rs.getString("User_Name"),
                rs.getString("Password"),
                rs.getDate("Create_Date"),
                rs.getString("Created_By"),
                rs.getDate("Last_Update"),
                rs.getString("Last_Updated_By")
        );
    }

    public User getUserByUsername(String username) throws SQLException {
        try {
            String q = String.format("SELECT * FROM users WHERE User_Name = \"%s\"", username);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            rs.next();
            return new User(
                    rs.getInt("User_ID"),
                    rs.getString("User_Name"),
                    rs.getString("Password"),
                    rs.getDate("Create_Date"),
                    rs.getString("Created_By"),
                    rs.getDate("Last_Update"),
                    rs.getString("Last_Updated_By")
            );
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
