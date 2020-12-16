package UI;

import ATM.*;
import Owner.OwnerOfTheCard;
import operations.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UserWindow {

    public CheckPinFrame checkPinFrame;
    public MainFrame mainFrame;
    public  ATMFrame atmFrame;
    public  CheckAccountFrame checkAccountFrame;
    public CommunicationFeeFrame communicationFeeFrame;
    public MoneyTransferFrame moneyTransferFrame;
    public TakeMoneyFrame takeMoneyFrame;

    public AccountView accountView = new AccountView();
    public CommunicationFee communicationFee = new CommunicationFee();
    public TakeCard takeCard = new TakeCard();
    public  MoneyTranfer moneyTranfer = new MoneyTranfer();
    public TakeMoney takeMoney = new TakeMoney();

    public OwnerOfTheCard owner = new OwnerOfTheCard();

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

        communicationFeeFrame = new CommunicationFeeFrame();
        frames.add(communicationFeeFrame);

        moneyTransferFrame = new MoneyTransferFrame();
        frames.add(moneyTransferFrame);

        takeMoneyFrame = new TakeMoneyFrame();
        frames.add(takeMoneyFrame);

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

            atmFrame.getCheckAccount().addActionListener(actionEvent1 ->{
                setFramesNotVisible();
                checkAccountFrame = new CheckAccountFrame(accountView.withdraw(atm.getBankCard().getAccount()));
                frames.add(checkAccountFrame);
                atm.takeOperation(accountView.getOperationName());
                checkAccountFrame.getNextStep().addActionListener(actionEvent2 -> {
                    setFramesNotVisible();
                    atmFrame.setVisible(true);
                });
            });

            atmFrame.getTakeCard().addActionListener(actionEvent3 -> {
                setFramesNotVisible();
                mainFrame.setVisible(true);

            });

            atmFrame.getCommunicationFee().addActionListener(actionEvent4 -> {
                setFramesNotVisible();
                communicationFeeFrame.setVisible(true);
                communicationFeeFrame.getButton().addActionListener(actionEvent5 -> {
                    setFramesNotVisible();
                    atm.takeOperation(communicationFee.getOperationName());
                    atmFrame.setVisible(true);

                });
            });

            atmFrame.getMoneyTransfer().addActionListener(actionEvent6 -> {
                setFramesNotVisible();
                moneyTransferFrame.setVisible(true);
                moneyTransferFrame.getButton().addActionListener(actionEvent7 -> {
                    setFramesNotVisible();
                    atm.takeOperation(moneyTranfer.getOperationName());
                    atmFrame.setVisible(true);

                });
            });
            atmFrame.getTakeMoney().addActionListener(actionEvent8 ->{
                setFramesNotVisible();
                takeMoneyFrame.setVisible(true);
                atm.takeOperation(takeMoney.getOperationName());
                takeMoneyFrame.getButton().addActionListener(actionEvent9 ->{
                    setFramesNotVisible();
                    atmFrame.setVisible(true);
                });
            });

        });
    }

    public  void createWindow(Operation operation){
        if(operation.getOperationName().equals("Просмотр счёта")){
            checkAccountFrame.setVisible(true);
        }
        if(operation.getOperationName().equals("Забрать карту")){
            takeCard.takeCard(atm);
        }
        if(operation.getOperationName().equals("Платеж за связь")){
            communicationFee.makeATransfer(atm.getBankCard().getAccount(), communicationFeeFrame.getMoney());
        }
        if(operation.getOperationName().equals("Перевод денег")){
            moneyTranfer.makeATransfer(atm.getBankCard().getAccount(), moneyTransferFrame.getMoney());
        }
        if (operation.getOperationName().equals("Забрать деньги"))
            takeMoney.takeMoney(atm.getBankCard().getAccount(), atm, owner, takeMoneyFrame.getMoney());

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

