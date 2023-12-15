/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;

/**
 *
 * @author Gheorghita Rata
 */
public class Options {
      public void printUserOptions() {
        System.out.println("Welcome! What would you like to do today? Please enter the number corresponding to your choice.");
        System.out.println("1. Enter a new player to a team.");
        System.out.println("2. See the players on a team.");
        System.out.println("3. Simulate a number of matches.");
        System.out.println("4. Exit the programme.");
    }

    public void playerData(){
        System.out.println("Please follow the instructions to enter player data.");
    }

    public void teamData(){
        System.out.println("For which team would you like to enter data?");

    }
}
