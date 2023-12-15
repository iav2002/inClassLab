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
public class Teams {
      public String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};

    private String name;

    public Teams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
