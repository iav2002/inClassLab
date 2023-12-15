/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bernardogandara
 */
public class PlayerDataInserter {
    private Connection connection;

    public PlayerDataInserter(Connection connection) {
        this.connection = connection;
    }

    public void insertPlayer(String teamName, String name, int number, String birth, String position, int goalsScored, String background) {
        try (Statement stmt = connection.createStatement()) {
            String sql = String.format("INSERT INTO %s (name, number, birth, position, goalsScored, background) "
                                       + "VALUES (\"%s\", %d, \"%s\", \"%s\", %d,  \"%s\");",
                                       teamName, name, number, birth, position, goalsScored, background);
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
