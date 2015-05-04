/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author computing01
 */
public class HomeController {
    private HomeGUI view;
    public HomeController(HomeGUI view)
    {
        this.view=view;
        this.view.addListener(new HomeActionListener());
    }
    
    class HomeActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JButton listButton = (JButton) e.getSource();
            switch(listButton.getText()){
                case "Matakuliah":
                    MatakuliahGUI gui = new MatakuliahGUI("Form Matakuliah",400,600);
                    try {
                        MataKuliah model;
                        model = new MataKuliah();
                        MatakuliahController controller = new MatakuliahController(model, gui);
                        view.setVisible(false);
                        gui.showMainView();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(view, "Gagal Koneksi Database");
                        gui.setVisible(false);
                        view.showMainView();
                    }
                    break;
                case "Keluar":
                    System.exit(0);
                    break;
            }
        }
        
    }
}
