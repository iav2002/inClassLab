/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bernardogandara
 */
public class PlayerDataDisplayer {
    private Connection connection;

    public PlayerDataDisplayer(Connection connection) {
        this.connection = connection;
    }

    public void displayTeamPlayers(String teamName) {
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + teamName + ";");

            while (rs.next()) {
                String name = rs.getString("name");
                int number = rs.getInt("number");
                String birth = rs.getString("birth");
                String position = rs.getString("position");
                int goalsScored = rs.getInt("goalsScored");
                String background = rs.getString("background");

                System.out.println(String.format("Name: %s -- Number: %d -- DoB: %s -- Position: %s -- Number of goals scored: %d",
                                                 name, number, birth, position, goalsScored));
                System.out.println("Background:");
                System.out.println(background);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
