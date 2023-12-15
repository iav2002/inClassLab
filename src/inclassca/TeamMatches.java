/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gheorghita Rata
 */
public class TeamMatches {
     private List<Teams> teams;

    public TeamMatches() {
        teams = new ArrayList<>();
        teams.add(new Teams("Ireland"));
        teams.add(new Teams("Brazil"));
        teams.add(new Teams("Argentina"));
        teams.add(new Teams("Japan"));
        teams.add(new Teams("Mexico"));
        teams.add(new Teams("Senegal"));
        teams.add(new Teams("Tunisia"));
        teams.add(new Teams("Qatar"));
    }

    public boolean isValidTeam(String teamName) {
        for (Teams team : teams) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                return true;
            }
        }
        return false;
    }
}
