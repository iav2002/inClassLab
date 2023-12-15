/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *

 * @author ignacioalarconvarela 2021357
 * Gheorghita Rata mda21563
 * Bernardo Gandara 2021283
 * Wellington 2021330
 * 
 * gitHub link: https://github.com/iav2002/inClassLab/blob/CA/src/inclassca/InClassCa.java
=======
 * @author Sam
 * Please put the names and student numbers of the team here:
 * 
 * Name 1:ignacio alarcon 
 * Number 1:2021357
 * 
 * Name 2:Gheorghita Rata
 * Number 2:mda21563
 * 
 * Name 3:Bernardo Gandara 
 * Number 3:2021283
 * 
 * Name 4:Wellington 
 * Number 4: 2021330
 * 
 */
public class InClassCa {

 
    public static void main(String[] args) {
       
        String dbName = "world_cup";
        String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};
        MatchSimulator simulator = new MatchSimulator(teams);
        
        DatabaseConnector dbConnManager = new DatabaseConnector("world_cup", "root", "root");
        //Because of scope issues, I had to create this empty object and initialize it later
        PlayerDataInserter playerInserter = null;
        PlayerDataDisplayer playerViewer = null;
        

        try {
            Connection conn = dbConnManager.getConnection();
            DatabaseOperation dbOps = new MySqlDatabaseOperations(conn);
            playerInserter = new PlayerDataInserter(conn);
            playerViewer = new PlayerDataDisplayer(conn);
            for (String team : teams) {
                dbOps.createTable(team);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

         Options options = new Options();
        Utilities utilities = new Utilities();
        
        
        int option;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        do {
            options.printUserOptions();          
            try {
                option = utilities.Get_user_int(1,4);
                if (option == 1) {
                    boolean validTeam = false;
                    String teamName;
                    System.out.println("Please follow the instructions to enter player data.");
                    do {
                        System.out.println("For which team would you like to enter data?");
                        teamName = sc.nextLine();
                        for (String team : teams) {
                            if (teamName.toLowerCase().equals(team.toLowerCase())) {
                                validTeam = true;
                                break;
                            }
                        }
                        if (teamName.toLowerCase().equals("exit")) break;
                        if (!validTeam) System.out.println("That is not one of the teams. Please try again!");
                    } while (!validTeam);
                    String name;
                    int number = 0;
                    String birth;
                    String position;
                    int goalsScored = 0;
                    String background;
                    boolean validPlayer = false;
                    System.out.println("Please enter the player's name: ");
                    name = sc.nextLine();
                    System.out.println("Please enter the player's number: ");
                    do {
                        try {
                            number = Integer.parseInt(sc.nextLine()); 
                            if (number < 1) {
                                System.out.println("Please enter a positive integer");
                            } else validPlayer = true;

                        } catch (Exception e) {
                            System.out.println("That is not a number. please try again!");
                        }
                    } while (!validPlayer);                                              
                    System.out.println("Please enter the player's date of birth: ");
                    birth = sc.nextLine();         
                    System.out.println("Please enter the player's position: ");
                    position = sc.nextLine(); 
                    System.out.println("Please enter the number of goals the player has scored: ");
                   
                    validPlayer = false;
                    do {
                        try {
                            goalsScored = Integer.parseInt(sc.nextLine()); 
                            if (goalsScored < 1) {
                                System.out.println("Please enter a positive integer");
                            } else validPlayer = true;

                        } catch (Exception e) {
                            System.out.println("That is not a number. please try again!");
                        }
                    } while (!validPlayer);     
                    System.out.println("Please enter the player's background: ");
                    background = sc.nextLine();                          
                    System.out.println("Thank you for entering a player"); 
                    //Storing the player in the Database
                    if (playerInserter != null) {
                        playerInserter.insertPlayer(teamName, name, number, birth, position, goalsScored, background);
                        System.out.println("Thank you for entering a player");
                    } else {
                    System.out.println("Database connection is not established. Cannot insert player data.");
                    }
                    
                } else if (option == 2) {
                    boolean validTeam = false;
                    String teamName;
                    System.out.println("Please follow the instructions to get player data.");
                    do {
                        System.out.println("For which team would you like to get player data?");
                        teamName = sc.nextLine();
                        for (String team : teams) {
                            if (teamName.toLowerCase().equals(team.toLowerCase())) {
                                validTeam = true;
                                break;
                            }
                        }
                        if (teamName.toLowerCase().equals("exit")) break;
                        if (!validTeam) System.out.println("That is not one of the teams. Please try again!");
                    } while (!validTeam);
                    if (playerViewer != null) {
                        playerViewer.displayTeamPlayers(teamName);
                    } else {
                        System.out.println("Database connection is not established. Cannot display player data.");
                    }
                } else if (option == 3) {
                   
                    System.out.println("How many matches would you like to simulate?");
                    
                    int numMatches = getPositiveIntegerFromUser(sc);
                  
                } else if (option == 4) {
                    System.out.println("Goodbye, and thank you for using the SoccerSimulator!");
                    exit = true;
                } else {
                    System.out.println("That is an invalid number. Please try again!");
                }
            } catch (Exception e) {
                System.out.println("That is not a number. Please try again!");
            }         
        } while (!exit);   
    
    
    
    }     

    
    
    
    private static int getPositiveIntegerFromUser(Scanner sc) {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num < 1) {
                    System.out.println("Please enter a positive integer");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a number. Please try again!");
            }
        }
        return num;
    }
        
           
    }
   
>>>>>>> b66ff25396e1144844de6aebd664b32f76cdfb7d
