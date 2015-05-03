package course_scheduling;

import java.awt.BorderLayout;
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
public class JadwalGUI extends GUI {
    
    JButton btnBack;
    JPanel toolsPanel, mainPanel;
    JScrollPane tablePanel;

    public JadwalGUI() {
        super();
    }

    public JadwalGUI(String frameTitle) {
        super(frameTitle);
    }

    public JadwalGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
    }

    public void showMainFrame() {
        initMainView();
        mainPanel.add(toolsPanel, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);
        platform.add(mainPanel);
        super.setVisible(true);
    }

    public void initMainView() {
        btnBack = new JButton("Kembali");
        mainPanel = new JPanel(new BorderLayout());
        toolsPanel = new JPanel(new GridLayout(1, 5));

        this.initButtonCRUD();
        toolsPanel.add(this.getBtnAdd());
        toolsPanel.add(this.getBtnEdit());
        toolsPanel.add(this.getBtnDelete());
        toolsPanel.add(Box.createHorizontalStrut(5));
        toolsPanel.add(btnBack);
        this.setPadding(toolsPanel, 0, 0, 5, 0);

        String[] columnName = {"#", "Kelas", "Dosen", "Matakuliah", "MataKuliah"};
        Object[][] dataRow = {};
        
        this.setDataTable(dataRow, columnName);
        tablePanel = new JScrollPane(this.getDataTable());
    }

}
