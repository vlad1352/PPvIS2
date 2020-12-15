package UI;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {

    private JButton start = new JButton("Вставить карту");
    private JButton exit = new JButton("Выйти из программы");
    private JLabel label1 = new JLabel("Готов к работе.");
    private JLabel label2  = new JLabel("Вставте вашу карту");


    private JPanel jPanel = new JPanel();


    public MainFrame(){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(layout);

        start.setMaximumSize(new Dimension(200, 30));
        exit.setMaximumSize(new Dimension(200,30));

        jPanel.add(Box.createVerticalGlue());
        jPanel.add(label1);
        jPanel.add(label2);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(start);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(exit);

        add(jPanel);


        setVisible(false);

    }
    public JButton getExit(){
        return exit;
    }
    public JButton getStart(){
        return start;
    }

}
