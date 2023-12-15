/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassca;

import inclassca.DatabaseOperation;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bernardogandara
 */
public class MySqlDatabaseOperations implements DatabaseOperation{
    private Connection connection;
    
    public MySqlDatabaseOperations(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void createTable(String tableName) throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                            + "name VARCHAR(30) NOT NULL,"
                            + "number INT NOT NULL PRIMARY KEY,"
                            + "birth VARCHAR(30),"
                            + "position VARCHAR(30),"
                            + "goalsScored INT,"
                            + "background TEXT(1000));"
            );
        }
    }
    
}
