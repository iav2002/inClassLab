/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TeamInput {
    Scanner mySc = new Scanner(System.in);
    private String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};
    
    public String selectTeam(){
        String teamName = "";
        boolean validTeam = false;
        System.out.println("Please follow the instructions to get player data.");
            do {
                System.out.println("For which team would you like to get player data?");
                    teamName = mySc.nextLine();  
                        for (String team : teams) {
                            System.out.println(team);
                            if (teamName.toLowerCase().equals(team.toLowerCase())) {
                                validTeam = true;
                            break;
                        }
                    }
                if (teamName.toLowerCase().equals("exit")) break;
                if (!validTeam) System.out.println("That is not one of the teams. Please try again!");
                } while (!validTeam);
            return teamName;
    }
}
