/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author alpha
 */
public class RuanganGUI extends GUI {

    private JButton btnBack, btnJadwal;
    private JPanel mainPanel, toolsPanel;
    private JScrollPane tablePanel;

    public RuanganGUI() {
        super();
    }

    public RuanganGUI(String frameTitle) {
        super(frameTitle);
    }

    public RuanganGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
    }

    public void showMainView() {
        initMainView();
        mainPanel.add(toolsPanel, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);
        platform.add(mainPanel);
        this.setVisible(true);
    }

    public void initMainView() {
        mainPanel = new JPanel(new BorderLayout());
        toolsPanel = new JPanel(new GridLayout(1, 6));
        btnBack = new JButton("Kembali");
        btnJadwal = new JButton("Shift");
        btnJadwal.setEnabled(false);
        this.initButtonCRUD();
        toolsPanel.add(this.getBtnAdd());
        toolsPanel.add(this.getBtnEdit());
        toolsPanel.add(this.getBtnDelete());
        toolsPanel.add(btnJadwal);
        toolsPanel.add(Box.createHorizontalStrut(10));
        toolsPanel.add(btnBack);
        this.setPadding(toolsPanel, 0, 0, 5, 0);
        String[] column = {"#", "Nama Ruangan", "Kuota"};
        Object[][] row = {};
        this.setDataTable(row, column);
        tablePanel = new JScrollPane(this.getDataTable());
    }
}
