package UI;

import ATM.ATM;

import javax.swing.*;
import java.awt.*;

public class CheckAccountFrame extends JFrame {

    public JLabel label1 = new JLabel(("Остаток на счёте"));
    public JLabel label2;
    public JButton nextStep = new JButton("Продолжить");
    public JPanel panel = new JPanel();

    CheckAccountFrame(double a){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        nextStep.setMaximumSize(new Dimension(200, 30));

        label2 = new JLabel(a + "   BYN");

        panel.add(label1);
        panel.add(Box.createVerticalGlue());
        panel.add(label2);
        panel.add(Box.createVerticalGlue());
        panel.add(nextStep);

        add(panel);



        setVisible(false);
    }

    public JButton getNextStep(){
        return nextStep;
    }
}
