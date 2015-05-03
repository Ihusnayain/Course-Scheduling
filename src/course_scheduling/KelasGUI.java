/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author alpha
 */
public class KelasGUI extends GUI {

    JButton btnEdit, btnAdd, btnBack;
    JPanel toolsPanel, mainPanel;
    JScrollPane tablePanel;

    public KelasGUI() {
        super();
    }

    public KelasGUI(String frameTitle) {
        super(frameTitle);
    }

    public KelasGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
    }

    public void showFrame() {
        initComponent();
        mainPanel.add(toolsPanel, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);
        platform.add(mainPanel);
        super.setVisible(true);
    }

    public void initComponent() {
        btnBack = new JButton("Kembali");
        mainPanel = new JPanel(new BorderLayout());
        toolsPanel = new JPanel(new GridLayout(1, 5));

        this.setPadding(toolsPanel, 0, 0, 5, 0);
        this.initButtonCRUD();
        toolsPanel.add(this.getBtnAdd());
        toolsPanel.add(this.getBtnEdit());
        toolsPanel.add(this.getBtnDelete());
        toolsPanel.add(Box.createHorizontalStrut(120));
        toolsPanel.add(btnBack);

        String columnNames[] = {"#", "Nama Kelas", "Jumlah Mahasiswa"};
        Object[][] rowData = {};

        this.setDataTable(rowData, columnNames);
        tablePanel = new JScrollPane(this.getDataTable());
    }

}
