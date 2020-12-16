package UI;

import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyBoundsAdapter;

public class ATMFrame extends JFrame {

    private JLabel label = new JLabel("Выберите операцию");
    private JPanel jPanel = new JPanel();
    private JButton checkAccount = new JButton("Просмотр счёта");
    private JButton communicationFee = new JButton("Платёж за связь");
    private JButton moneyTransfer = new JButton("Перевод денег");
    private JButton takeMoney = new JButton("Снять деньги");
    private JButton takeCard = new JButton("Забрать карту");


    ATMFrame (){
        setSize(250, 400);
        BoxLayout layout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(layout);
        checkAccount.setMaximumSize(new Dimension(200,30));
        communicationFee.setMaximumSize(new Dimension(200,30));
        moneyTransfer.setMaximumSize(new Dimension(200,30));
        takeCard.setMaximumSize(new Dimension(200,30));
        takeMoney.setMaximumSize(new Dimension(200,30));

        jPanel.add(label);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(checkAccount);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(communicationFee);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(moneyTransfer);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(takeMoney);
        jPanel.add(Box.createVerticalGlue());
        jPanel.add(takeCard);


        add(jPanel);

        setVisible(false);
    }

    public JButton getCheckAccount() {
        return checkAccount;
    }

    public JButton getCommunicationFee() {
        return communicationFee;
    }

    public JButton getMoneyTransfer(){
        return moneyTransfer;
    }

    public JButton getTakeMoney(){
        return takeMoney;
    }

    public JButton getTakeCard(){
        return takeCard;
    }
}
