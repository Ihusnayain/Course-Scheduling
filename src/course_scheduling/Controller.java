/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import javax.swing.JOptionPane;

/**
 *
 * @author computing01
 */
public class Controller {
    public void showError(GUI view, String msg)
    {
        JOptionPane.showMessageDialog(view, msg);
    }
}
