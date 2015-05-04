/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author computing01
 */
public class MatakuliahController {
    private MataKuliah model;
    private MatakuliahGUI view;
    
    public MatakuliahController(MataKuliah model,MatakuliahGUI view)
    {
        this.model = model;
        this.view = view;
        this.refreshdata();
        this.view.addListener(new MatakuliahListener(), new MatakuliahMouse(), new KeyboardListen());
    }
    
    public void refreshdata(){
        JTable table = view.getDataTable();
        JButton add = view.getBtnAdd();
        JButton edit = view.getBtnEdit();
        JButton delete = view.getBtnDelete();
        add.setEnabled(false);
        edit.setEnabled(false);
        delete.setEnabled(false);
        try {
            String[] a = {"ID Matakuliah","Nama Matakuliah","Kode Matakuliah"};
            table.setModel(new DefaultTableModel(model.show(), new Vector<String>(Arrays.asList(a))));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Kesalahan penulisan query");
        }
    }
    
    class MatakuliahListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JTable tbl = view.getDataTable();
            JButton btn = (JButton)e.getSource();
            String[] record = new String[3];
            if(tbl.getSelectedRow()>-1){
                record[0] = tbl.getValueAt(tbl.getSelectedRow(), 0).toString();
                record[1] = tbl.getValueAt(tbl.getSelectedRow(), 1).toString();
                record[2] = tbl.getValueAt(tbl.getSelectedRow(), 2).toString();
            }
            switch(btn.getText()){
                case "Tambah":
                    try {
                        model.save(record);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(view, "Kesalahan database");
                    }
                    refreshdata();
                    break;
                case "Edit":
                    try {
                        model.update(record[0],record);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(view, "Kesalahan database");
                    }
                    refreshdata();
                    break;
                case "Delete":
                    System.out.print("");
                    try {
                        model.delete(record[0]);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(view, "Kesalahan database");
                    }
                    refreshdata();
                    break;
                case "Kembali":
                    view.setVisible(false);
                    HomeGUI home = new HomeGUI("Home", 400, 600);
                    HomeController homeC = new HomeController(home);
                    home.showMainView();
                    break;
            }
        }
        
    }
    
    class MatakuliahMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            JTable tbl = (JTable) e.getSource();
            if (tbl.getSelectedRow()<tbl.getRowCount()-1){
                view.getBtnAdd().setEnabled(false);
                view.getBtnEdit().setEnabled(true);
                view.getBtnDelete().setEnabled(true);
            }else{
                view.getBtnAdd().setEnabled(true);
                view.getBtnEdit().setEnabled(false);
                view.getBtnDelete().setEnabled(false);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    class KeyboardListen implements KeyListener{

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}
