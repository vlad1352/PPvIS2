package UI;

import javax.swing.*;
import java.awt.*;

public class TakeMoneyFrame extends JFrame {

    private JPanel jPanel = new JPanel();
    private JLabel label1 = new JLabel("Введите сумму денег");
    private JTextField field = new JTextField();
    private JButton button = new JButton("Забрать деньги");

    public TakeMoneyFrame(){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(layout);
        button.setMaximumSize(new Dimension(200,30));
        field.setMaximumSize(new Dimension(300, 30));


        jPanel.add(label1);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(field);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(button);

        add(jPanel);

        setVisible(false);
    }
    public double getMoney(){
        return Double.parseDouble(field.getText());
    }
    public JButton getButton(){
        return button;
    }
}
