package course_scheduling;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Erudite-101
 */
public class HomeGUI extends GUI {

    private JPanel mainPanel, greetPanel, toolsPanel;
    private JButton[] listButton;

    public HomeGUI() {
        super();
    }

    public HomeGUI(String frameTitle) {
        super(frameTitle);
    }

    public HomeGUI(String frameTitle, int height, int width) {
        super(frameTitle, height, width);
    }

    public void showMainView() {
        initMainView();
        mainPanel.add(greetPanel, BorderLayout.NORTH);
        mainPanel.add(toolsPanel, BorderLayout.CENTER);
        platform.add(mainPanel);
        this.setVisible(true);
    }

    public void initMainView() {
        greetPanel = new JPanel();
        mainPanel = new JPanel(new BorderLayout());
        JLabel greet = new JLabel("Selamat Datang di Course Scheduling");
        greetPanel.add(greet);
        this.setPadding(greetPanel, 0, 0, 5, 0);

        String[] btnTitle = {"Matakuliah", "Dosen", "Kelas", "Jadwal", "Ruangan", "Keluar"};

        listButton = new JButton[6];
        toolsPanel = new JPanel(new GridLayout(2, 3, 25, 25));
        for (int i = 0; i < listButton.length; i++) {
            listButton[i] = new JButton(btnTitle[i]);
            toolsPanel.add(listButton[i]);
        }
    }

}
