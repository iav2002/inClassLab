/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassca;

import java.util.Scanner;

/**
 *
 * @author Gheorghita Rata
 */
public class Utilities {
    public int Get_user_int(int minValue, int maxValue) {
        Scanner myScanner = new Scanner(System.in);
        int input = -1;
        boolean valid = false;
        do {
            //System.out.print(options.);
            try {
                input = myScanner.nextInt();
                if (input < minValue || input > maxValue) {
                    System.out.println("The number entered does not match requimentes. Please, try again:");
                } else {

                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("The value entered is not an integer. Please type only 1 or 2");
                myScanner.next();
            }
        } while (!valid);
        System.out.println("");
        return (input);
    }
}
