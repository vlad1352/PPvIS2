package ATM;

import Owner.Money;
import UI.UserWindow;
import operations.AccountView;
import operations.Operation;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private BankCard bankCard;
    private Money atmMoney;
    private UserWindow userWindow;
    private List<Operation> operations = new ArrayList<>();

    public ATM(){
        atmMoney = new Money();
        atmMoney.setAmountOfMoney(2000);
        atmMoney.setCurrency("BYN");
        userWindow = new UserWindow(this);

        AccountView accountView = new AccountView();
        accountView.setUserWindow(userWindow);
        operations.add(accountView);


    }

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

    public BankCard getBankCard() {
        return bankCard;
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




}
