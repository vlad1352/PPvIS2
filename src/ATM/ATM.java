package ATM;

import Owner.Money;
import UI.UserWindow;
import operations.*;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private BankCard bankCard;
    private Money atmMoney;
    private UserWindow userWindow;
    private List<Operation> operations = new ArrayList<>();

    public ATM(){ }

    public Boolean checkPin(int pin){
    Boolean checkPin;
        if(bankCard.getPinCode() == pin)
            checkPin = true;
        else
            checkPin = false;
        return  checkPin;
    }

    public Boolean authentication(int pin){
        return checkPin(pin);
    }

    public Boolean   acceptCard (BankCard bankCard){
        this.bankCard = bankCard;
        return true;
    }

    public BankCard returnCard(){
        BankCard card = bankCard;
        bankCard = null;
        return card;
    }

    public void acceptMoney(double money){

    }

    public void setOperations(){
        AccountView accountView = new AccountView();
        accountView.setUserWindow(userWindow);
        operations.add(accountView);
        CommunicationFee communicationFee = new CommunicationFee();
        operations.add(communicationFee);
        MoneyTranfer moneyTranfer = new MoneyTranfer();
        operations.add(moneyTranfer);
        TakeCard takeCard = new TakeCard();
        operations.add(takeCard);
        TakeMoney takeMoney = new TakeMoney();
        operations.add(takeMoney);
    }

    public void giveOutMoney(double money){
        this.atmMoney.deductMoney(money);
    }

    public void takeOperation(String operationName){
        for (Operation operat : operations) {
            if(operat.getOperationName().equals(operationName)){
                startOperation(operat);
                break;
            }

        }
    }

    public  void startOperation(Operation operation){
        operation.execute();
    }

    public void setBankCard(BankCard bankCard){
        this.bankCard = bankCard;
    }
    public BankCard getBankCard(){
        return bankCard;
    }

    public void setAtmMoney(Money atmMoney){
        this.atmMoney = atmMoney;
    }
    public Money getAtmMoney(){
        return atmMoney;
    }

    public void setUserWindow(UserWindow userWindow){
        this.userWindow = userWindow;
    }
    public UserWindow getUserWindow(){
        return userWindow;
    }
}
