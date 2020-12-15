package UI;

import javax.swing.*;
import java.awt.*;

public class ATMFrame extends JFrame {

    private JLabel label = new JLabel("Выберите операцию");
    private JPanel jPanel = new JPanel();
    private JButton checkAccount = new JButton("Просмотр счёта");

    ATMFrame (){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(layout);
        checkAccount.setMaximumSize(new Dimension(200,30));
        jPanel.add(label);
        jPanel.add(Box.createVerticalGlue());
        jPanel .add(checkAccount);

        add(jPanel);

        setVisible(false);
    }

    public JButton getCheckAccount() {
        return checkAccount;
    }
}
