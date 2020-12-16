package operations;

import ATM.Account;
import operations.Operation;

public class CommunicationFee extends Operation {

    private String type;
    private int number;
    private String operator;
    private double amountOfMoney;

    public CommunicationFee(){
        operationName = "Платеж за связь";
    }

    @Override
    public void execute() {
        userWindow.createWindow(this);
    }

    public Boolean checkSolvency(Account account, double money){
        Boolean check = false;
            if(account.withdrawMoney(money))
                check = true;
        return check;
    }

    public Boolean makeATransfer(Account account, double money){
        return checkSolvency(account, money);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
