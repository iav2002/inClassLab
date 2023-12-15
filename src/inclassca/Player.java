/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;

/**
 *
 * @author Wellington Mariano 2021330
 */
public class Player {
    private String name;
    private int number;
    private String birth;
    private String position;
    private int goalsScored;
    private String background;
    private boolean valid;

    public Player(String name, int number, String birth, String position, int goalsScored, String background, boolean valid) {
        this.name = name;
        this.number = number;
        this.birth = birth;
        this.position = position;
        this.goalsScored = goalsScored;
        this.background = background;
        this.valid = valid;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", number=" + number + ", birth=" + birth + ", position=" + position + ", goalsScored=" + goalsScored + ", background=" + background + ", valid=" + valid + '}';
    }
    
    
}
