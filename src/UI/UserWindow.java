package UI;

import ATM.*;
import operations.Operation;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UserWindow {

    public CheckPinFrame checkPinFrame;
    public MainFrame mainFrame;
    public  ATMFrame atmFrame;

    private String information;
    private List<JFrame> frames = new ArrayList<>();
    private ATM atm;

    public UserWindow(ATM atm){
        this.atm = atm;

        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        frames.add(mainFrame);
        checkPinFrame = new CheckPinFrame();
        frames.add(checkPinFrame);
        atmFrame = new ATMFrame();
        frames.add(atmFrame);


        mainFrame.getExit().addActionListener(actionEvent -> {
            exit();
        });
        mainFrame.getStart().addActionListener(actionEvent -> {
            atm.acceptCard(new BankCard());
           mainFrame.setVisible(false);
           checkPinFrame.setVisible(true);
        });

        checkPinFrame.getContinue1().addActionListener(actionEvent -> {
            int pin = Integer.parseInt(checkPinFrame.textField.getText());
            if(atm.authentication(pin)){
                setFramesNotVisible();
                atmFrame .setVisible(true);
            }
        });

    }

    public  void createWindow(Operation operation){
        if(operation.getOperationName().equals("Просмотр счёта")){

        }

    }

    public void exit(){
        System.exit(0);
    }

    public void setFramesNotVisible(){
        for (JFrame frame: frames) {
            frame.setVisible(false);
        }
    }

}

