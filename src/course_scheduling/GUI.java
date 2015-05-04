package course_scheduling;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Erudite-101
 */
public class GUI extends JFrame {

    private String frameTitle;
    private int height, width;
    protected JPanel platform;
    private JTable dataTable;
    private JButton btnAdd, btnEdit, btnDelete, btnSave, btnReset;

    public GUI() {
        initFrame();
    }

    public GUI(String frameTitle) {
        this.frameTitle = frameTitle;
        initFrame();
    }

    public GUI(String frameTitle, int height, int width) {
        this.frameTitle = frameTitle;
        this.height = height;
        this.width = width;
        initFrame();
    }

    private void initFrame() {
        super.setTitle(frameTitle);
        super.setSize(width, height);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setResizable(false);

        platform = new JPanel();
        platform.setLayout(new BoxLayout(platform, BoxLayout.Y_AXIS));
        platform.setBorder(new EmptyBorder(5, 5, 5, 5));
        super.add(platform);
        super.setLocation(400, 180);
        super.setVisible(true);
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public void initButtonCRUD() {
        btnAdd = new JButton("Tambah");
        btnEdit = new JButton("Edit");
        btnDelete = new JButton("Delete");
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void initButtonForm() {
        btnSave = new JButton("Simpan");
        btnReset = new JButton("Reset");
    }

    public String getFrameTitle() {
        return frameTitle;
    }

    public void setFrameTitle(String frameTitle) {
        this.frameTitle = frameTitle;
    }

    public int getFrameHeight() {
        return height;
    }

    public void setFrameHeight(int height) {
        this.height = height;
    }

    public int getFrameWidth() {
        return width;
    }

    public void setFrameWidth(int width) {
        this.width = width;
    }

    public void setPadding(JPanel panel, int top, int right, int bottom, int left) {
        panel.setBorder(new EmptyBorder(top, left, bottom, right));
    }

    public void setPadding(JPanel panel, int tb, int lr) {
        panel.setBorder(new EmptyBorder(tb, lr, tb, lr));
    }

    public void setDataTable(Object[][] rowData, String[] columnName) {
        dataTable = new JTable(rowData, columnName);
        dataTable.getColumnModel().getColumn(0).setMaxWidth(40);
    }

    public JTable getDataTable() {
        return dataTable;
    }


}
