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
public class DosenGUI extends GUI {
    
    private JButton btnBack;
    private JPanel toolsPanel, mainPanel;
    private JScrollPane tablePanel;

    public DosenGUI() {
        super();
    }

    public DosenGUI(String frameTitle) {
        super(frameTitle);
    }

    public DosenGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
    }

    @SuppressWarnings("empty-statement")
    public void showMainView() {
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
        toolsPanel.add(Box.createHorizontalStrut(120));
        toolsPanel.add(btnBack);

        this.setPadding(toolsPanel, 0, 0, 5, 0);

        String columnNames[] = {"#", "NIP", "Kode Dosen", "Nama"};
        Object[][] rowData = {};

        this.setDataTable(rowData, columnNames);
        tablePanel = new JScrollPane(this.getDataTable());
    }

}
