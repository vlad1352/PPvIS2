package UI;

import javax.swing.*;
import java.awt.*;

public class CheckPinFrame extends JFrame{

    private JPanel jPanel = new JPanel();
    private JButton  continue1 = new JButton("Подтвердить");
    private  JLabel label = new JLabel("Введите пин коде");
    public JTextField textField = new JTextField();


    CheckPinFrame(){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(layout);

        continue1.setMaximumSize(new Dimension(200,30));
        textField.setMaximumSize(new Dimension(300,30));
        jPanel.add(label);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(textField);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(continue1);
        add(jPanel);
        setVisible(false);
    }

    public JButton getContinue1(){
        return continue1;
    }

}
