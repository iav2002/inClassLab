/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bernardogandara
 */
public class DatabaseConnector {
    private String dbName;
    private String user;
    private String pass;

    public DatabaseConnector(String dbName, String user, String pass) {
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String dbURL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        return DriverManager.getConnection(dbURL, user, pass);
    }
}
