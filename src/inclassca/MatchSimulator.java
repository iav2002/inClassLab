/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassca;

import java.util.Random;

/**
 *
 * @author ignacioalarconvarela
 */
public class MatchSimulator {
   
      private String[] teams;
    private Random random;

    public MatchSimulator(String[] teams) {
        this.teams = teams;
        this.random = new Random();
    }

    public void simulateMatches(int numMatches) {
        for (int matchNum = 1; matchNum <= numMatches; matchNum++) {
            simulateSingleMatch(matchNum);
        }
    }

    private void simulateSingleMatch(int matchNum) {
        int team1Num = random.nextInt(teams.length);
        String team1 = teams[team1Num];
        int team2Num;
        do {
            team2Num = random.nextInt(teams.length);
        } while (team1Num == team2Num);
        String team2 = teams[team2Num];
        int team1Score = random.nextInt(6);
        int team2Score = random.nextInt(6);
        
        announceMatch(matchNum, team1, team2, team1Score, team2Score);
    }

    private void announceMatch(int matchNum, String team1, String team2, int team1Score, int team2Score) {
        System.out.println("Time for match: " + matchNum);
        if (team1Score > team2Score) {
            System.out.println(String.format("Congratulations %s! %s scored %d goals and %s scored %d goals.", team1, team1, team1Score, team2, team2Score));
        } else if (team1Score < team2Score) {
            System.out.println(String.format("Congratulations %s! %s scored %d goals and %s scored %d goals.", team2, team1, team1Score, team2, team2Score));
        } else {
            System.out.println(String.format("It was a draw!! %s scored %d goals and %s scored %d goals.", team1, team1Score, team2, team2Score));
        }
    } 
}
