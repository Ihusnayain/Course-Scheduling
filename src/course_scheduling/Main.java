/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

/**
 *
 * @author Ihda Husnayain
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeGUI home = new HomeGUI("Home", 400, 600);
        HomeController homeC = new HomeController(home);
        home.showMainView();
    }

}
