/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wellington Mariano 2021330
 */
public class PlayerRetriever{
    private Player player;
    String dbName = "world_cup";
    String DB_URL = "jdbc:mysql://localhost/" + dbName;
    String USER = "football";
    String PASS = "Java is almost as good as football";
    
    public Player player(String teamName){
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + teamName + ";");
                while (rs.next()) {
                    player.setName(rs.getString("name"));
                    player.setNumber(rs.getInt("number"));
                    player.setBirth(rs.getString("birth"));
                    player.setPosition(rs.getString("position"));
                    player.setGoalsScored(rs.getInt("goalsScored"));
                    player.setBackground(rs.getString("background"));              
                    System.out.println(player.toString());
                    System.out.println("Background:");
                    System.out.println(player.getBackground());
                }     
            } catch (SQLException e) {
                e.printStackTrace();
            }   
        return player;
    }
}