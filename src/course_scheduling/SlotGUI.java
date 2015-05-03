package course_scheduling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author alpha
 */
public class SlotGUI extends GUI {

    private JPanel mainPanel, toolsPanel;
    private JButton btnBack;
    private JScrollPane tablePanel;
    private Ruangan ruang;
    private JTable dataTable;

    public SlotGUI() {
        super();
        ruang = new Ruangan("", 0);
    }

    public SlotGUI(String frameTitle) {
        super(frameTitle);
        ruang = new Ruangan("", 0);
    }

    public SlotGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
        ruang = new Ruangan("", 0);
    }

    public void setRuangan(Ruangan ruang) {
        this.ruang = ruang;
    }

    public Ruangan getRuangan() {
        return ruang;
    }

    public void showMainView() {
        initMainView();
        mainPanel.add(new JLabel("Shift Ruangan " + ruang.getNamaRuangan()));
        mainPanel.add(toolsPanel, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);
        platform.add(mainPanel);
        this.setVisible(true);
    }

    public void initMainView() {
        btnBack = new JButton("Kembali");
        toolsPanel = new JPanel(new GridLayout(1, 5));
        mainPanel = new JPanel(new BorderLayout());
        this.initButtonCRUD();
        toolsPanel.add(this.getBtnAdd());
        toolsPanel.add(this.getBtnEdit());
        toolsPanel.add(this.getBtnDelete());
        toolsPanel.add(Box.createHorizontalStrut(10));
        toolsPanel.add(btnBack);
        this.setPadding(toolsPanel, 0, 0, 5, 0);

        String[] column = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
        Object[][] row = {};
        dataTable = new JTable(row, column);
        tablePanel = new JScrollPane(dataTable);
    }

}
